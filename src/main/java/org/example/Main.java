package org.example;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    private static String stage = "STAGE_INIT";
    public static void main(String[] args) {
//        Check check = new Check();
        Map<String, Check> mapCheck = new HashMap<>();
        Map<String, JsonNode> nodeMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            ObjectNode newNode = objectMapper.createObjectNode();

            File file = new File("../input.json");
            System.out.println("Path to file\n" + file.getAbsolutePath());
            // read json file
            JsonNode rootNode = objectMapper.readTree(file);

            Integer inputStage;
            ArrayNode arrayNode = objectMapper.createArrayNode();
            for (int i = 0; i < rootNode.size(); i++) {
                System.out.println("The name is: " + rootNode.get(i).get("name"));
                // Scan from console
                System.out.println("1 - Пропустить наименование\n" + "2 - Добавить наименование в новый файл\n" + "3 - Выход");
                inputStage = scanner.nextInt();
                if (inputStage == 2) {
                    // add current element to new json array in new file
                    arrayNode.add(rootNode.get(i));
//                    System.out.println(arrayNode);
                } else if (inputStage == 1) {

                } else if (inputStage == 3) {
                    break;
                } else {
                    // uncorrect input, try again
                    if (inputStage != 1 && inputStage != 2 && inputStage != 3) {
                        System.out.println("Неверный ввод, попробуйте еще раз");
                        i--;
                    }
                }
            }

            System.out.println("The new array is: " + arrayNode);

            // Сохраняем все значения поля name из input файла в output файл
            objectMapper.writeValue(new File("output.json"), arrayNode);


        } catch (IOException e) {
            System.out.println(e.getMessage());
            // Handle the exception
        }
    }
}
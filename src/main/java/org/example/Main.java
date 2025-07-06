package org.example;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Check check = new Check();
        Map<String, Check> mapCheck = new HashMap<>();

        try {

            ObjectMapper objectMapper = new ObjectMapper();
            ObjectNode newNode = objectMapper.createObjectNode();

            File file = new File("input.json");
            System.out.println("Path to file\n" + file.getAbsolutePath());
            // read json file
            JsonNode rootNode = objectMapper.readTree(file);

            for (int i = 0; i < rootNode.size(); i++) {
                mapCheck.put(rootNode.get(i).get("name").asText(), new Check(rootNode.get(i)));
            }
//            System.out.println(mapCheck);

            mapCheck.remove("Ваттметр бытовой цифровой в розетку, цифровой измеритель мощности, розетка-ваттметр, измеритель энергии, напряжения до 16А.");
            for (Map.Entry<String, Check> entry : mapCheck.entrySet()) {
//                if (entry.getValue().getBuyerAddress().equals("123")) {
                    System.out.println(entry.getKey());
//                }
                newNode.put(entry.getKey(), entry.getValue().toString());
            }


//            System.out.println(rootNode.get(0).get("buyerAddress"));
//            System.out.println(rootNode.get(0).getClass());

//            System.out.println(rootNode.size());
            // create new json file

            // Сохраняем все значения поля name из input файла в output файл
            for (int i = 0; i < rootNode.size(); i++) {
//                newNode.put("name", rootNode.get(i).get("name"));
                newNode.putArray("name");
            }
            objectMapper.writeValue(new File("output.json"), newNode);
            objectMapper.writeValue(new File("output.json"), newNode);
//            for (JsonNode node : rootNode) {
//                newNode.put("name", node.get("name"));
//                System.out.println(node.get("name"));
//            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
            // Handle the exception
        }
    }
}
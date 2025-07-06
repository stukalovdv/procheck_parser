package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 *  Класс содержит формат кассового чека, получаемого от входного файла JSON
 *  Набор полей:
 *      buyerAddress
 *      cashTotalSum
 *      creditSum
 *      dateTime
 *      documentType
 *      ecashTotalSum
 *      email
 *      fiscalDocumentNumber
 *      fiscalDriveNumber
 *      fiscalSign
 *      kktRegId
 *      nds0
 *      nds10
 *      nds10110
 *      nds18
 *      nds18118
 *      ndsNo
 *      operationType
 *      operator
 *      phone
 *      prepaidSum
 *      properties
 *      provisionSum
 *      requestNumber
 *      retailPlace
 *      retailPlaceAddress
 *      shiftNumber
 *      taxationType
 *      totalSum
 *      user
 *      userInn
 *      name
 *      price
 *      quantity
 *      sum
 *      nds
 *      paymentType
 */
public class Check {
    // поля чека из набора
    private static final String buyerAddress = "buyerAddress";
    private static final String cashTotalSum = "cashTotalSum";
    private static final String creditSum = "creditSum";
    private static final String dateTime = "dateTime";
    private static final String documentType = "documentType";
    private static final String ecashTotalSum = "ecashTotalSum";
    private static final String email = "email";
    private static final String fiscalDocumentNumber = "fiscalDocumentNumber";
    private static final String fiscalDriveNumber = "fiscalDriveNumber";
    private static final String fiscalSign = "fiscalSign";
    private static final String kktRegId = "kktRegId";
    private static final String nds0 = "nds0";
    private static final String nds10 = "nds10";
    private static final String nds10110 = "nds10110";
    private static final String nds18 = "nds18";
    private static final String nds18118 = "nds18118";
    private static final String ndsNo = "ndsNo";
    private static final String operationType = "operationType";
    private static final String operator = "operator";
    private static final String phone = "phone";
    private static final String prepaidSum = "prepaidSum";
    private static final String provisionSum = "provisionSum";
    private static final String requestNumber = "requestNumber";
    private static final String retailPlace = "retailPlace";
    private static final String retailPlaceAddress = "retailPlaceAddress";
    private static final String shiftNumber = "shiftNumber";
    private static final String taxationType = "taxationType";
    private static final String totalSum = "totalSum";
    private static final String user = "user";
    private static final String userInn = "userInn";
    private static final String name = "name";
    private static final String price = "price";
    private static final String quantity = "quantity";
    private static final String sum = "sum";
    private static final String nds = "nds";
    private static final String paymentType = "paymentType";
    private static final String properties = "properties";
    public static final String[] checkFields = {
            buyerAddress,
            cashTotalSum,
            creditSum,
            dateTime,
            documentType,
            ecashTotalSum,
            email,
            fiscalDocumentNumber,
            fiscalDriveNumber,
            fiscalSign,
            kktRegId,
            nds0,
            nds10,
            nds10110,
            nds18,
            nds18118,
            ndsNo,
            operationType,
            operator,
            phone,
            prepaidSum,
            provisionSum,
            requestNumber,
            retailPlace,
            retailPlaceAddress,
            shiftNumber,
            taxationType,
            totalSum,
            user,
            userInn,
            name,
            price,
            quantity,
            sum,
            nds,
            paymentType,
            properties
    };

    public Check(JsonNode rootNode) {

    }




}

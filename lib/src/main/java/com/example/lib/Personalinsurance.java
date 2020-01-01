package com.example.lib;

import java.util.concurrent.CountDownLatch;

public class Personalinsurance {
    private String[] PIName=new String[100];
    private int CountN = 0;
    private String[] PIPhoneNumber=new String[100];
    private String[] InsuranceCoverage=new String[100];
    public void inputdata(String piName, String piPhoneNumber, String insuranceCoverage) {
        PIName[CountN] = piName;
        PIPhoneNumber[CountN] = piPhoneNumber;
        InsuranceCoverage[CountN] = insuranceCoverage;
        CountN++;
    }
    public void outputData() {
        System.out.println("個人意外保險");
        for (int i = 0; i < CountN; i++)
            System.out.printf("姓名:%s 電話:%s 投保額度:%s \n", PIName[i], PIPhoneNumber[i], InsuranceCoverage[i]);
    }
}
package com.example.lib;

public class Groupinurance {
    private String[] GIName=new String[100];
    private int CountN = 0;
    private String[] GPIName=new String[100];
    private String[] InsuranceCoverage=new String[100];
    public void inputdata(String giName, String gpiName, String insuranceCoverage) {
        GIName[CountN] = giName;
        GPIName[CountN] = gpiName;
        InsuranceCoverage[CountN] = insuranceCoverage;
        CountN++;
    }
    public void outputData() {
        System.out.println("團體意外保險");
        for (int i = 0; i < CountN; i++)
            System.out.printf("公司:%s 姓名:%s 投保額度:%s \n", GIName[i], GPIName[i], InsuranceCoverage[i]);
    }
}
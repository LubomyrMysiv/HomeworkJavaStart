package com.lmys.HomeWork4New.Conditions;

public class MinMaxCalculator {
    public static void main(String[] args) {

        int a = 2;
        int b = 25;
        int min = a;
        int max = b;

        if (min > b) {
            min = b;
            max = a;
        }

        System.out.println("min = " + min + "\n" + "max = " + max);
    }
}






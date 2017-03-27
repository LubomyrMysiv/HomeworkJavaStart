package com.lmys.HomeWork4New.Conditions;

import java.util.Scanner;

public class AgeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your age: ");
        int parseAge = scanner.nextInt();
        if (parseAge > 0 && parseAge <= 120) {
            System.out.print(parseAge);}
        else throw new IllegalArgumentException("Enter correct age");

    }
}

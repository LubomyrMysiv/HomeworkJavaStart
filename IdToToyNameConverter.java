package com.lmys.HomeWork4New.Conditions;

import java.util.Scanner;

public class IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        if (id == 0) {
            System.out.println("Car");}
        if (id == 1) {
            System.out.println("Lego");}
        if (id == 2) {
            System.out.println("Doll");}
        if (id == 3) {
            System.out.println("Puzzle");}
            else    throw new IllegalArgumentException("Enter correct id");

    }
}

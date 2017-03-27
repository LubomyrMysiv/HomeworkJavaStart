package com.lmys.HomeWork4New.Loops;


public class StarPrinter {
    public static void main(String[] args) {

        int rows = 8;
        int cols = 8;

        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


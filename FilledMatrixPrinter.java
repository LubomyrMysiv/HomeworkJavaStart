package com.lmys.HomeWork4New.Loops;

public class FilledMatrixPrinter {
    public static void main(String[] args) {

        int rows = 8;
        int cols = 3;
        int filler = -1;

        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= cols; k++) {
                System.out.print(filler);
            }

            System.out.println();
        }
    }
}



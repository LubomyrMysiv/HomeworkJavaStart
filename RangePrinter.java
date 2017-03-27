package com.lmys.HomeWork4New.Loops;

public class RangePrinter {
    public static void main(String[] args) {
        int i = 1;
        int k = 1;

        if (i <= k) {
            for (int j = i; j <= k; j++) {

                System.out.println(j);
            }

        } else {
            for (int j = i; j >= k; j--) {
                System.out.println(j);

            }
        }
    }
}

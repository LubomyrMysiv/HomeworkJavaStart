package com.lmys.HomeWork4New.Loops;


public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 4;
        long factorial = 1;
        if (n < 1 && n > 20) throw new IllegalArgumentException();
        for (int k = 1; k <= n; k++) {
            factorial *= k;
        }
        System.out.println(factorial);
    }
}


package com.lmys.HomeWork4New.Loops;

public class EvensRangePrinter {
    public static void main(String[] args) {
        int first = 1;
        int last = 14;
        if (first % 2 != 0)
            first++;
        if (first <= last) {
            for (int i = first; i <= last; i += 2) {
                System.out.println(i);

            }
        }
    }
}

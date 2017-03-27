package com.lmys.HomeWork4New.Loops;

import java.util.IllegalFormatCodePointException;

public class RangeWithStepPrinter {
    public static void main(String[] args) {
        int first = 5;
        int last = 3;
        int step = 1;

        if (first <= last && step >= 0)
            for (int i = first; i <= last; i += step) {
                System.out.println(i);
            }

        else if (first >= last && step <= 0)
            for (int i = first; i >= last; i += step) {
                System.out.println(i);
            }
        else throw new IllegalArgumentException();
    }

}

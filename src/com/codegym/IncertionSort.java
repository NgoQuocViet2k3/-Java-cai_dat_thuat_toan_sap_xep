package com.codegym;

public class IncertionSort {

    public static void main(String[] args) {
        int[] arrayInts = {7, 4, 6, 23, 26, 18, 16, 13};
        incertionSort(arrayInts);
    }

    public static void incertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            BubbleSort.printArray(i, a);
        }
    }
}

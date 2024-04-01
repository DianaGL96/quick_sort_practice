package ru.diana.quick_sort_practice.service;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(String[] name, int low, int high) {
        if (name.length == 0 || low >= high) return;
        int middle = low + (high - low) / 2;
        String border = name[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (name[i].compareTo(border) < 0) {
                i++;
            }
            while (name[j].compareTo(border) > 0) {
                j--;
            }
            if (i <= j) {
                String swap = name[i];
                name[i] = name[j];
                name[j] = swap;
                i++;
                j--;
                System.out.println(Arrays.toString(name));
            }
        }
        if (low < i) quickSort(name, low, j);
        if (high > i) quickSort(name, i, high);
    }
}

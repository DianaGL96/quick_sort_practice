package ru.diana.quick_sort_practice.main;

import java.util.Arrays;

import static ru.diana.quick_sort_practice.service.QuickSort.quickSort;

public class Main {
    public static void main(String [] arr) {
        String[] name = {"Diana", "Alex", "Karina", "Stanislav", "Mary"};
        System.out.println(Arrays.toString(name));
        quickSort(name, 0, name.length - 1);
        System.out.println(Arrays.toString(name));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Lenovo
 */
public class QuickSort {
    public static void sort(int[] a) {
        if (a == null || a.length <= 1) return;
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int mid = low + (high - low) / 2;
        int pivot = a[mid];
        swap(a, mid, high);

        int store = low;
        for (int i = low; i < high; i++) {
            if (a[i] < pivot) {
                swap(a, i, store);
                store++;
            }
        }
        swap(a, store, high);
        return store;
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}

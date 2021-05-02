package sorting;


import org.junit.Test;

import java.util.Arrays;

public class QuickSort {

    @Test
    public void testQuickSort() {
        int[] arr = {3, 4, 2, 1, 7, 8, 9, 11};
        quickSort(arr, 0, arr.length - 1);
        //O[n^2] best: O[nLog2n]
        System.out.println(Arrays.toString(arr));
    }

    void quickSort(int[] arr, int l, int r) {

        if (l < r) {
            int firstElement = getFirstSortedElement(arr, l, r);
            quickSort(arr, l, firstElement - 1);
            quickSort(arr, firstElement + 1, r);
        }

    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    int getFirstSortedElement(int[] arr, int l, int r) {
        int pivot = arr[(l + r) / 2];
        int m = l;
        int n = r;

        while (m < n) {
            while (arr[m] <= pivot)
                m++;
            while (arr[n] > pivot)
                n--;

            if (m < n)
                swap(arr, m, n);
        }
        swap(arr, n, l);

        return n;
    }
}

package sorting;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {

    @Test
    public void testInsertionSort() {
        int[] arr = {3, 4, 2, 1, 7, 8, 9, 11};
        //O[n^2] optimized over bubble sort
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    int[] insertionSort(int[] arr) {
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while ((j >= 0) && (arr[j] > temp)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        return arr;
    }
}

package sorting;

import org.junit.Test;

import java.util.Arrays;

public class SelectionSort {

    @Test
    public void testSelectionSort() {
        int[] in = {3, 4, 2, 1, 7, 8, 9, 11};
        //O[n^2]
        System.out.println(Arrays.toString(selectionSort(in)));
    }

    int[] selectionSort(int[] arr) {
        int l = arr.length;
        int minIndex = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}

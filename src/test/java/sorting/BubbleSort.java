package sorting;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort {

    @Test
    public void testBubbleSort() {
        int[] arr = {3, 4, 2, 1, 7, 8, 9, 11};
        //O[n^2]
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }

    int[] bubbleSort(int[] arr) {
        int l = arr.length;
        boolean isSorted = true;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                break;
        }
        return arr;
    }

}


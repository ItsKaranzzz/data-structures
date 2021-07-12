package sorting;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort {

    @Test
    public void testMergeSort() {
        int[] arr = {3, 4, 2, 1, 7, 8, 9, 11};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    //best & avg: O[nLog2n]
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private void merge(int[] arr, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = middle + 1, k = 0;

        while ((i <= middle) && (j <= right)) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        while (i <= middle) {
            temp[k++] = arr[i++];
        }

        for (int x = left; x <= right; x++) arr[x] = temp[x - left];
    }

}

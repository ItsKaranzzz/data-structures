package recursion;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 3, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotateArray(arr, 3)));
        System.out.println(Arrays.toString(rotate(arr2, 3)));
    }

    static int[] rotateArray(int[] in, int k) {
        int temp, last;
        for (int j = 0; j < k; j++) {
            last = in[in.length - 1];
            for (int i = 0; i < in.length; i++) {
                temp = in[i];
                in[i] = last;
                last = temp;
            }
        }

        return in;
    }

    static int[] rotate(int arr[], int k) {

        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}

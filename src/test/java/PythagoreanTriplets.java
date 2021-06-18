import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PythagoreanTriplets {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 7, 2, 24, 12, 1, 5, 6, 4, 9, 13, 10, 25};
        System.out.println(getPythagoreanTripletsFromAnArray(arr));
    }

    public static List<List<Integer>> getPythagoreanTripletsFromAnArray(int[] arr) {
        Arrays.setAll(arr, i -> (int) pow(arr[i], 2));
        Arrays.sort(arr);
        int b, c, a;
        List<List<Integer>> output = new LinkedList<>();


        for (int i = arr.length - 1; i >= 2; i--) {
            b = 0;
            c = i - 1;
            a = i;
            while (b < c) {
                if (arr[b] + arr[c] == arr[a]) {
                    List<Integer> triplets = new LinkedList<>();
                    triplets.add((int) sqrt(arr[b]));
                    triplets.add((int) sqrt(arr[c]));
                    triplets.add((int) sqrt(arr[a]));
                    output.add(triplets);
                    b++;
                    c--;
                }
                if (arr[b] + arr[c] < arr[a]) {
                    b++;
                } else
                    c--;
            }
        }
        return output;
    }
}

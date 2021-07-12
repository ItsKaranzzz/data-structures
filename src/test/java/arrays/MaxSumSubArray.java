package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int testSumToBeFound1 = 0;
        int testSumToBeFound2 = 6;
        System.out.println(isGivenSumSubArrayPresent(input, testSumToBeFound1));
        System.out.println(isGivenSumSubArrayPresent(input, testSumToBeFound2));
        System.out.println(Arrays.toString(input));

    }

    static boolean isGivenSumSubArrayPresent(int[] arr, int k) {
        boolean found = false;
        int sum = 0;
        Set<Integer> temp = new HashSet<>();
        for (int value : arr) {
            sum += value;
            temp.add(sum);
            if (temp.contains(sum - k)) {
                found = true;
                break;
            }
        }
        return found;
    }
}

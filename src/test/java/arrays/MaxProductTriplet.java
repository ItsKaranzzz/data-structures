package arrays;

import org.junit.Test;

import java.util.Arrays;

public class MaxProductTriplet {

    @Test
    public void testTripletMaxProduct() {
        int[] arr = {9, -2, -3, -2, 4, 5, 0};
        System.out.println(getMaxProductTriplet(arr));
    }

    int getMaxProductTriplet(int[] arr) {
        int l = arr.length;
        if (l < 3)
            return -1;
        Arrays.sort(arr);
        return Math.max(arr[l - 1] * arr[l - 2] * arr[l - 3], arr[0] * arr[1] * arr[l - 1]);
    }
}

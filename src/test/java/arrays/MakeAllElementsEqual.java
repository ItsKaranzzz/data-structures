package arrays;

import org.junit.Test;

public class MakeAllElementsEqual {

    @Test
    public void testFunToMakeAllArrayElementEqual() {
        int[] arr = {4,4,3};
        System.out.println(minStepsToMakeAllElementsEqual(arr));
    }

    int minStepsToMakeAllElementsEqual(int[] arr) {

        int l = arr.length, min = arr[0], sum = 0;

        for (int each : arr) {
            min = Math.min(min, each);
            sum += each;
        }

        return sum - min * l;
    }
}

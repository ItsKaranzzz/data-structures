package searching;

import org.junit.Assert;
import org.junit.Test;

public class SearchElement {
    int arr[] = {4, 12, 2, 5, 6, 8, 11, 7, 9};
    int blankArray[] = {};
    int validSearchData = 5;
    int invalidSearchData = 10;

    @Test
    public void testLinearSearch() {
        Assert.assertEquals(3, linearSearch(arr, validSearchData));
        Assert.assertEquals(-1, linearSearch(arr, invalidSearchData));
        Assert.assertEquals(-1, linearSearch(blankArray, validSearchData));
    }

    int linearSearch(int[] arr, int key) {
        int l = arr.length;
        if (l < 1)
            return -1;
        for (int i = 0; i < l; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
}

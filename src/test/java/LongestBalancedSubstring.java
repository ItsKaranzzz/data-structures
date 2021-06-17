import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestBalancedSubstring {

    String input = "0100110";

    @Test
    public void testLongestBalancedSubstring() {
        System.out.println(getLongestSubstring(input));
    }

    String getLongestSubstring(String s) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int count = 0, leftIndex = 0, rightIndex = 0, maxLen = 0;

        char[] charArray = s.toCharArray();
        for (int i = 0; i<charArray.length; i++) {
            int each = Integer.parseInt(String.valueOf(charArray[i]));
            count += (each == 1) ? 1 : -1;
            if (map.containsKey(count)) {
                leftIndex = map.get(count);
                maxLen = Math.max(maxLen, i - leftIndex);
                rightIndex = i;
            } else
                map.put(count, i);
        }

        return s.substring(leftIndex, rightIndex);

    }
}

package recursion;

import org.junit.Test;

public class StringSubsets {

    String input = "karan";

    @Test
    public void testStringSubsets() {
        fetchAllSubsetsOfString(input, 0, "");
    }

    void fetchAllSubsetsOfString(String s, int left, String cur) {
        if (left == s.length()) {
            System.out.println(cur);
            return;
        }
        fetchAllSubsetsOfString(s, left + 1, cur + s.charAt(left));
        fetchAllSubsetsOfString(s, left + 1, cur);
    }
}

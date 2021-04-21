package recursion;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfString {
    static Set<String> noDup = new HashSet<>();

    public static void main(String[] args) {

        String input = "abc";
        allPermutationsOfString(input, 0, input.length() - 1);
    }

    static void allPermutationsOfString(String s, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) {
            if (noDup.add(s))
                System.out.println(s);
            return;
        }
        for (int i = leftIndex; i <= rightIndex; i++) {
            s = interchange(s, leftIndex, i);
            allPermutationsOfString(s, leftIndex + 1, rightIndex);
            s = interchange(s, leftIndex, i);
        }

    }

    static String interchange(String s, int a, int b) {
        char[] arr = s.toCharArray();
        char swap = arr[a];
        arr[a] = arr[b];
        arr[b] = swap;
        return String.valueOf(arr);
    }
}

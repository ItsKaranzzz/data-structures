package recursion;

import org.junit.Test;

public class Palindrome {

    String input = "";

    @Test
    public void testPalindromeUsingRecursion() {

        System.out.println(palindromeCheck(input, 0, input.length() - 1));
    }

    boolean palindromeCheck(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r))
            return false;
        return palindromeCheck(s, l + 1, r - 1);
    }
}

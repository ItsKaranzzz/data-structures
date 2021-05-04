import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisTest {

    @Test
    public void testParenthesisInserted() {

        String s = "]";
        System.out.println(isBalancedParenthesis(s));
    }

    boolean isBalancedParenthesis(String s) {

        Map<Character, Character> braces = new HashMap<>();
        braces.put('}', '{');
        braces.put(']', '[');
        braces.put(')', '(');
        Stack<Character> stack = new Stack<>();

        for (char each : s.toCharArray()) {
            if (braces.containsKey(each)) {
                char toBePopped = (stack.isEmpty()) ? '.' : stack.pop();
                if (toBePopped != braces.get(each))
                    return false;
            } else
                stack.push(each);

        }
        return stack.isEmpty();
    }
}

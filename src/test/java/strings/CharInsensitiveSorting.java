package strings;

import java.util.ArrayList;
import java.util.List;

public class CharInsensitiveSorting {

    public static void main(String[] args) {
        String input = "bcaCzBklABC";
        System.out.println(sortStringInsensitively(input));
    }

    static String sortStringInsensitively(String in) {
        List<String> chars = new ArrayList<>();
        for(char each: in.toCharArray())
            chars.add(Character.toString(each));
        chars.sort(String.CASE_INSENSITIVE_ORDER);
        StringBuilder builder = new StringBuilder();
        chars.forEach(builder::append);
        return builder.toString();
    }
}

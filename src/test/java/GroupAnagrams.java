import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] input = {"aac", "dog", "ama", "maa", "god", "xyz", "cac"};
        System.out.println(groupAnagram(input));
    }

    static List<List<String>> groupAnagram(String[] in) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String each : in) {
            char[] arr = each.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!anagrams.containsKey(sorted)) {
                anagrams.put(sorted, new LinkedList<>());
            }

            anagrams.get(sorted).add(each);
        }
        return new LinkedList<>(anagrams.values());
    }
}

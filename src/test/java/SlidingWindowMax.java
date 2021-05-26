import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input = {1, 2, 1, 4, 5, 2, 3, 6};
        System.out.println(Arrays.toString(solution.getMaxOfSlidingWindow(input, 5)));
        System.out.println(solution.getMax(solution.getMaxOfSlidingWindow(input, 3)));
    }

    static class Solution {

        int[] getMaxOfSlidingWindow(int[] arr, int k) {
            int l = arr.length;
            int[] out = new int[l - k + 1];
            int m = 0;
            Deque<Integer> deque = new LinkedList<>();
            if (l <= 1)
                return arr;

            for (int i = 0; i < l; i++) {
                //REMOVE FIRST ELEMENT IF ITS NOT FROM CURRENT WINDOW
                if (!deque.isEmpty() && (deque.peekFirst() <= i - k)) {
                    deque.removeFirst();
                }
                //ORDERING THE INDEXES BASED ON VALUES IN DECREASING ORDER IN DEQUEUE
                while (!deque.isEmpty() && (arr[deque.peekLast()] <= arr[i])) {
                    deque.removeLast();
                }
                deque.add(i);
                //INSERTING ANSWERS AFTER GETTING EACH WINDOW MAX IN DEQUEUE
                if (i >= k - 1)
                    out[m++] = arr[deque.peekFirst()];
            }
            return out;
        }

        int getMax(int[] arr) {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
    }
}

package recursion;

public class GameTheory {

    public static void main(String[] args) {
        int input[] = {1, 2, 5, 6, 33, 6, 77, 8, 5, 2};
        System.out.println(winningPoints(input, 0, input.length - 1));
    }

    static int winningPoints(int[] arr, int l, int r) {

        if (l + 1 == r) {
            return Math.max(arr[l], arr[r]);
        }

        return Math.max(arr[l] + Math.min(winningPoints(arr, l + 1, r - 1), winningPoints(arr, l + 2, r)),
                arr[r] + Math.min(winningPoints(arr, l, r - 2), winningPoints(arr, l + 1, r - 1)));
    }
}

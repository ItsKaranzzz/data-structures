package recursion;

import org.junit.Test;

public class PowerOfANumber {

    @Test
    public void testPowFunction() {
        System.out.println(power(2, 4));
        System.out.println(pow(2, 4));
        System.out.println(powWithoutRec(2, 4));
    }

    int power(int n, int k) {
        if (k == 0)
            return 1;
        if ((k & 1) == 0)
            return power(n * n, k / 2);
        else
            return power(n, k - 1) * n;
    }

    int pow(int n, int k) {
        int out = 1;
        for (int i = 1; i <= k; i++) {
            out *= n;
        }
        return out;
    }

    int powWithoutRec(int n, int k) {
        int out = 1;
        while (k >= 1) {
            if ((k & 1) == 1)
                out = out * n;

            n = n * n;
            k = k >> 1;
        }
        return out;
    }
}

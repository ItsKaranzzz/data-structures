package inputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CustomReader {

    StringTokenizer stringTokenizer;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private String next() {
        while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
            try {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringTokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public Double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine() {
        String out = "";

        try {
            out = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }
}

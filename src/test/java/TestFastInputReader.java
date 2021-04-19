import inputReader.CustomReader;

import java.util.ArrayList;
import java.util.List;

public class TestFastInputReader {

    public static void main(String[] args) {

        CustomReader read = new CustomReader();
        System.out.println("Enter max limit");
        int n = read.nextInt();
        List<String> names = new ArrayList<>();
        System.out.println("Enter names as per limit");
        for (int i = 0; i < n; i++) {
            names.add(read.nextLine());
        }

        names.forEach(System.out::println);
    }
}

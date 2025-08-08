package generic;

import java.util.Arrays;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Praful", "Ramu", "Shyam");
        print(names);
    }

    public static void print(List<?> values) {
        System.out.println(values);
    }
}

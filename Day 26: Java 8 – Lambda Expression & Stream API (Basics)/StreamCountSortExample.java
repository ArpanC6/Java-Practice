import java.util.*;
import java.util.stream.*;

public class StreamCountSortExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Arpan", "Ravi", "Ankit", "Sourav");

        long count = names.stream().count();
        System.out.println("Total Names: " + count);

        names.stream()
             .sorted()
             .forEach(System.out::println);
    }
}

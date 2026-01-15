import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> it = list.listIterator();

        System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}

import java.util.*;

public class SafeRemoveIterator {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == 2) {
                it.remove(); // safe
            }
        }

        System.out.println(list);
    }
}

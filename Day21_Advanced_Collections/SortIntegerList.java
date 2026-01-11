import java.util.*;

public class SortIntegerList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Before Sorting: " + list);

        Collections.sort(list);   // ascending order
        System.out.println("After Sorting (Ascending): " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After Sorting (Descending): " + list);
    }
}

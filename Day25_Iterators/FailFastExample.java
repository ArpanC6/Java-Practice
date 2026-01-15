import java.util.*;

public class FailFastExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i : list) {
            if (i == 2) {
                list.remove(i); // Exception here
            }
        }
    }
}

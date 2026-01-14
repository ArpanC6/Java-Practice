import java.util.*;

public class SortStringList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Arpan");
        names.add("Rahul");
        names.add("Amit");
        names.add("Sourav");

        Collections.sort(names);
        System.out.println("Sorted Names: " + names);
    }
}

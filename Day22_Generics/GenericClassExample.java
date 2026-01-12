import java.util.ArrayList;

public class WithoutGenericsProblem {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Java");   // runtime problem

        for (Object obj : list) {
            Integer num = (Integer) obj; // ClassCastException
            System.out.println(num);
        }
    }
}

import java.util.*;

public class SortStudentComparable {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Arpan", 85));
        list.add(new Student(2, "Rahul", 72));
        list.add(new Student(3, "Suman", 90));

        Collections.sort(list); // uses compareTo()

        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
}

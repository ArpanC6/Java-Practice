import java.util.*;

public class SortStudentByName {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arpan", 85));
        list.add(new Student(2, "Rahul", 72));
        list.add(new Student(3, "Suman", 90));

        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
}

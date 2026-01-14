import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class StudentComparable {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Arpan"));
        list.add(new Student(1, "Rahul"));
        list.add(new Student(2, "Amit"));

        Collections.sort(list);
        System.out.println(list);
    }
}

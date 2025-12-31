class Student {
    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Arpan";
        s1.age = 20;

        s1.displayDetails();
    }
}

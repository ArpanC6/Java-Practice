class Person {
    String name;
    int age;

   
    Person() {
        name = "Unknown";
        age = 0;
    }

    void show() {
        System.out.println(name + " - " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.show();
    }
}

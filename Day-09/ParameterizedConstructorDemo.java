class Employee {
    String name;
    int salary;

    // Parameterized Constructor
    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arpan", 30000);
        e1.display();
    }
}

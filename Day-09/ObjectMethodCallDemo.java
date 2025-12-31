class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}

public class ObjectMethodCallDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Sum: " + c.add(10, 20));
        System.out.println("Product: " + c.multiply(5, 4));
    }
}

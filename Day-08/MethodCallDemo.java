public class MethodCallDemo {

    static void greet() {
        System.out.println("Hello from greet method");
    }

    static void welcome() {
        greet();
        System.out.println("Welcome to Java programming");
    }

    public static void main(String[] args) {
        welcome();
    }
}

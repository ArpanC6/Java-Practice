public class GenericMethodExample {

    public static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        display(10);
        display("Hello Java");
        display(3.14);
    }
}

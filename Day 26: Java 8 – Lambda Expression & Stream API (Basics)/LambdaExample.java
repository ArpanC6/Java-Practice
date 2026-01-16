@FunctionalInterface
interface MyInterface {
    void show();
}

public class LambdaExample {
    public static void main(String[] args) {

        MyInterface obj = () -> {
            System.out.println("Hello from Lambda Expression");
        };

        obj.show();
    }
}

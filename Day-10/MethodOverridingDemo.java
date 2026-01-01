class Bank {
    void interest() {
        System.out.println("General interest");
    }
}

class SBI extends Bank {
    @Override
    void interest() {
        System.out.println("SBI interest is 6%");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.interest();
    }
}

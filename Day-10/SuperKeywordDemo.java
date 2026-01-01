class Vehicle {
    int speed = 60;
}

class Bike extends Vehicle {
    int speed = 100;

    void showSpeed() {
        System.out.println("Bike speed: " + speed);
        System.out.println("Vehicle speed: " + super.speed);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.showSpeed();
    }
}

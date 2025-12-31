class Car {
    String brand;

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

public class MultipleObjectsDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "BMW";
        c2.brand = "Audi";

        c1.showBrand();
        c2.showBrand();
    }
}

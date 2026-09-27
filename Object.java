class Car {
    String color;
    String model;
    void startEngine() {
        System.out.println(model + " engine started");
    }
    void stopEngine() {
        System.out.println(model + " engine stopped");
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        System.out.println("My car color: " + myCar.color);
        myCar.startEngine();
        myCar.stopEngine();
    }
}

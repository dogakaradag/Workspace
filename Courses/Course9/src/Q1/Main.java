package Q1;

public class Main {
    public static void main(String[] args) {
        // ClassName objName = new Constructor(params);
        Car car = new Car("Mercedes", "C200", 200);
        Bicycle bicycle = new Bicycle("Yamaha", "500",6);


        car.accelerate();

        car.displayInfo();
        System.out.println();

        car.decelerate();

        car.displayInfo();
        System.out.println();

        bicycle.accelerate();

        bicycle.displayInfo();
        System.out.println();

        bicycle.decelerate();

        bicycle.displayInfo();
        System.out.println();

    }
}
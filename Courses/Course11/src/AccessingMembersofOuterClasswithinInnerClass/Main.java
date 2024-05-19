package AccessingMembersofOuterClasswithinInnerClass;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda","8WD");
        Car.Engine engine1 = car1.new Engine();
        engine1.setEngine();
        System.out.println("Engine Type: " + engine1.getEngineType());

        Car car2 = new Car("Crysler","4WD");
        Car.Engine engine2 = car2.new Engine();
        engine2.setEngine();
        System.out.println("Engine Type: " + engine2.getEngineType());
    }
}

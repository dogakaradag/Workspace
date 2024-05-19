package Question1;

public class Vehicle {
    public String make;
    public String model;
    public int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("The engine is starting. ");
    }

    public void describeVehicle(){
        System.out.println("Make: " + this.make +
                " // Model: " + this.model +
                " // Year: " + this.year);
    }
}

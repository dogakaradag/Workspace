package Q1;

public abstract class Vehicle {
    private String make;
    private String model;
    private double currentSpeed;

    public Vehicle(String make, String model){
        this.currentSpeed = 0;
        this.make = make;
        this.model = model;
    }

    public abstract void accelerate();
    public abstract void decelerate();

    public void displayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Current speed: " + currentSpeed);
    }

    public void setCurrentSpeed(double speed){
        this.currentSpeed = speed;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }
}

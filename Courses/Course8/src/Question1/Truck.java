package Question1;

public class Truck extends Vehicle{
    double cylinderVolume;

    Truck(String make, String model, int year, double cylinderVolume){
        super(make, model, year);
        this.cylinderVolume = cylinderVolume;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine starts with a loud roar. ");
    }
}

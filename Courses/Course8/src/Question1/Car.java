package Question1;

public class Car extends Vehicle{
    int horsePower;

    Car(String make, String model, int year, int horsePower){
        super(make, model, year);
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starts quietly. ");
    }
}

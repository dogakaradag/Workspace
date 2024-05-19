package Question2;

public class Laptop extends ElectronicDevice{
    int batteryLife;
    Laptop(String brand, String model, double price, int batteryLife){
        super(brand, model, price);
        this.batteryLife = batteryLife;

    }
    @Override
    public void turnOn(){
        System.out.println("Laptop powers on and boot sound plays." );

    }
}

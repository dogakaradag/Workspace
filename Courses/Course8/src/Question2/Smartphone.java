package Question2;

public class Smartphone extends ElectronicDevice{
    String sim;
    Smartphone(String brand, String model, double price, String sim){
        super(brand, model, price);
        this.sim = sim;

    }
    @Override
    public void turnOn(){
        System.out.println("Smartphone lights up and vibrates" );

    }
}

package Question2;

public class Tablet extends ElectronicDevice{
    String pencilType;
    Tablet(String brand, String model, double price,String pencilType){
        super(brand, model, price);
        this.pencilType = pencilType;

    }
    @Override
    public void turnOn(){
        System.out.println("Tablet screen lights up " );

    }
}

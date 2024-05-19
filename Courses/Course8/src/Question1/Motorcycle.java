package Question1;

public class Motorcycle extends Vehicle {
    int cc;
    Motorcycle  ( String make, String model, int year, int cc){
        super(make, model, year);
        this.cc = cc;
    }
    @Override
    public void startEngine(){
        System.out.println("Motorcycle engine starts with a high rev. ");
    }
}

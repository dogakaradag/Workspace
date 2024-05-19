package Q1;

public class Car extends Vehicle{
    private double horsePower;

    public Car(String make, String model, double horsePower){
        super(make,model);
        this.horsePower = horsePower;
    }

    @Override
    public void accelerate() {
        this.setCurrentSpeed(this.getCurrentSpeed() + 12);
    }

    @Override
    public void decelerate() {
        if(this.getCurrentSpeed()>=10){
            this.setCurrentSpeed(this.getCurrentSpeed() - 10);
        }
        else if(this.getCurrentSpeed()<10){
            setCurrentSpeed(0);
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Horse Power: " + horsePower);
    }
}

package Q1;

public class Bicycle extends Vehicle {
    private int gear;

    public Bicycle(String make,String model, int gear){
        super(make,model);
        this.gear = gear;
    }

    @Override
    public void accelerate() {
        this.setCurrentSpeed(this.getCurrentSpeed() + 3);
    }

    @Override
    public void decelerate() {
        if(this.getCurrentSpeed()>=2){
            this.setCurrentSpeed(this.getCurrentSpeed() - 2);
        }
        else if(this.getCurrentSpeed()<2){
            setCurrentSpeed(0);
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gear: " + gear);
    }
}

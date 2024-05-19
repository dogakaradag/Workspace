package AccessingMembersofOuterClasswithinInnerClass;

public class Car {
    String carName;
    String carType;

    Car(String name, String type){
        this.carName = name;
        this.carType = type;
    }

    private String getCarName(){
        return this.carName;
    }

    // inner class
    class Engine{
        String engineType;

        void setEngine(){
            if(Car.this.carType.equalsIgnoreCase("4WD")){
                if(Car.this.getCarName().equalsIgnoreCase("Crysler")){
                    this.engineType = "Small";
                }
                else{
                    this.engineType = "Bigger";
                }
            }
            else{
                this.engineType = "Very Big";
            }
        }

        String getEngineType(){
            return engineType;
        }
    }
}

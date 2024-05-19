package InnerClass;

public class Computer {
    double price;

    class Processor{
        int coreNumber;
        String manufacturer;

        double getBuzzSpeed(){
            return 4.3;
        }
    }

    protected class RAM{
        int memory;
        String manufacturer;

        double getClockSpeed(){
            return 1333.3;
        }
    }
}

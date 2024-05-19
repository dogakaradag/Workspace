package Question2;

public class ElectronicDevice {
    String brand;
    String model;
    double price;

    ElectronicDevice(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void turnOn(){
        System.out.println("The device is turning on.");
    }

    public String displayInfo() {
        return "Model: " + model + ", Price: " + price;


    }

    // ArrayLists in Java
    // Abstraction, Encapsulation, Polymorphism
}

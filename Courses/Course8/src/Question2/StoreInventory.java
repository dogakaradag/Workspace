package Question2;


import java.util.ArrayList;
import java.util.Scanner;

 public class StoreInventory {
    ArrayList<ElectronicDevice> devices;

    public  StoreInventory(){
        this.devices = new ArrayList<>();
    }

    public void addDevice(ElectronicDevice device){
        devices.add(device);
    }

    public void removeDevice(ElectronicDevice device){
        devices.remove(device);
    }

    public void listAllDevices(){
        for (ElectronicDevice device : devices) {


            System.out.println(device.displayInfo());
            device.turnOn();
        }
    }
    public void searchByBrand(String Brand){
       for (ElectronicDevice device : devices){
           if(device.brand.equalsIgnoreCase(Brand)){
               System.out.println(device.displayInfo());
           }
       }
    }
}

package Question1;

import java.util.ArrayList;

public class VehicleManager {
    ArrayList<Vehicle> vehicles;

    VehicleManager(){
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

    public void displayVehicles(){
        for(Vehicle v :vehicles){
            v.describeVehicle();
            v.startEngine();
        }
    }

    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();

        // Create instances of each type of vehicle
        Truck truck = new Truck("Ford", "F-150", 2020, 4.5);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Street 750", 2019, 750);

        // Add vehicles to the manager
        manager.addVehicle(truck);
        manager.addVehicle(motorcycle);

        // Display information about all vehicles
        manager.displayVehicles();
    }
}

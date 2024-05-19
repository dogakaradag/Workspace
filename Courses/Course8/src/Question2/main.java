package Question2;

import java.util.Scanner;


    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StoreInventory inventory = new StoreInventory();


            Smartphone phone1 = new Smartphone("Samsung", "Galaxy S21", 999.99, "Nano-SIM");
            Tablet tablet1 = new Tablet("Apple", "iPad Pro", 799.99, "Apple Pencil");
            Laptop laptop1 = new Laptop("Dell", "XPS 15", 1199.99, 10);


            inventory.addDevice(phone1);
            inventory.addDevice(tablet1);
            inventory.addDevice(laptop1);


            System.out.println("Listing all devices:");
            inventory.listAllDevices();


            System.out.println("\nEnter a brand to search for:");
            String brand = scanner.nextLine();
            System.out.println("Searching for devices by brand: " + brand);
            inventory.searchByBrand(brand);

            scanner.close();
        }
    }


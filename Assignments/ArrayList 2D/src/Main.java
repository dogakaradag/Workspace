import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> vehicles = new ArrayList(); //IKI KERE ARRAYLIST YAZIYORUZ KI 2D OLSUN.
        ArrayList <String> publicTransport= new ArrayList();
        publicTransport.add("Bus");
        publicTransport.add("Subway");
        publicTransport.add("Ferry");

        ArrayList <String> privateVehicles= new ArrayList();
        privateVehicles.add("Car");
        privateVehicles.add("Motorcycle");
        privateVehicles.add("Limo");


        vehicles.add(publicTransport);
        vehicles.add(privateVehicles);

        System.out.println(vehicles);






    }
}
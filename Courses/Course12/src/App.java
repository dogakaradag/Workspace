public class App {
    public static void main(String[] args) throws Exception {
        Database db1 = Database.getInstance(); // Database object created
        Database db2 = Database.getInstance(); // Using the same object
        System.out.println(db1 == db2); // true

        Database db3 = Database.getInstance(); // Using the same object
        System.out.println(db1 == db3); // true

        
    }
}

public class App {
    public static void main(String[] args) {
        Person doa = new Person("doa", "female", "student", 20);
        Person ayberk = new Person("ayberk","male","software engineer",23);
        Person unknown = new Person();
        Person copy = new Person(doa);

        doa.printInfo();
        ayberk.printInfo();
        unknown.printInfo();
        copy.printInfo();
    }
}

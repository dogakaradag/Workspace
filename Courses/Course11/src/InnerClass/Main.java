package InnerClass;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor();
        Computer.RAM ram = computer.new RAM();

        System.out.println(ram.getClockSpeed());
        System.out.println(processor.getBuzzSpeed());
    }
}
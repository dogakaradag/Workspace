package StaticNestedClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MotherBoard mb = new MotherBoard();
        MotherBoard.USB usb = new MotherBoard.USB();
//        MotherBoard.USB usb = mb.new USB()
        System.out.println(usb.getTotalPorts());
    }
}

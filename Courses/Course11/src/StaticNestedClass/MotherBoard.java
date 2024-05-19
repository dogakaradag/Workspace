package StaticNestedClass;

public class MotherBoard {
    String manuf;

    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;

        int getTotalPorts(){
            return usb2 + usb3;
        }

        void printMBStatus(){
//            System.out.println(MotherBoard.this.manuf);
        }
    }
}

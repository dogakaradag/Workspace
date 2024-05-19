//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle exampleRectangle = new Rectangle(5,10);

        System.out.println("Area: " + exampleRectangle.area());
        System.out.println("Perimeter: "+ exampleRectangle.perimeter());



        //Bonus (checking if the rectangle is square)

        if (exampleRectangle.isSquare()){
            System.out.println("This is a square. ");
        }else{
            System.out.println("This is not a square. ");
        }
    }



}
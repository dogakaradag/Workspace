package Example1;
public class Main {
    public static void main(String[] args) {
        int x = 16;
        int y = 4;

       
        Code code = new Code();
        
        System.out.println("The GCD of " + x + " and " + y + " is " + code.gcd(x, y));
    }
    
}

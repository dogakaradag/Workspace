public class Ex6 {
    /*
        Overloading for Area Calculation

        Overload a Java method named calculateArea to calculate the area of different shapes. Write one version
        of the method to calculate the area of a circle (taking the radius as a parameter) and another to calculate
        the area of a rectangle (taking the length and breadth as parameters).
    */
    public static void main(String[] args) {
        System.out.println("Circle Area: " + calculateArea(3.14f));
        System.out.println("Rectangle Area: " + calculateArea(5f,9f));
        System.out.println("Triangle Area: " + calculateArea(5d,9f));

    }
    public static float calculateArea(float radius){
        return (float)(Math.PI * radius * radius);
    }
    public static float calculateArea(float sideLength1, float sideLength2){
        return (sideLength1 * sideLength2);
    }
    public static float calculateArea(double height, double baseLength){
        return (float)((height * baseLength)) / 2;
    }
}

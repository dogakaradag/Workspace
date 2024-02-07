import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.set(0,1);
        for (int i =0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

    }
}
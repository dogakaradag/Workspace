import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // String[] animals = {"cat","dog","capybara","penguin"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("bird");
        animals.add("capybara");
        animals.add("penguin");

        for (String i : animals) {
            System.out.println(i);

        }
    }
}
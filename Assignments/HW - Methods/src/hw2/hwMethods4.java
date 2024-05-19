package hw2;

public class hwMethods4 {
    public static void main(String[] args) {
        String str1= "hello";
        String str2= "world";
        String finalResult = concatenateStrings(str1,str2);
        System.out.println(finalResult);

    }
    public static String concatenateStrings(String str1, String str2){
        String result = str1 + str2;
        return result;
    }
}

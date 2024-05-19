package hw2;

//SESLİ HARF SAYISINI BULAN KOD (YAZAMADIM) GERCEKTEN MI
public class hwMethods7 {
    public static void main(String[] args) {
        String str = "SEN BU ODEVI NASIL YAPAMADIN";
        int vowelCount = countVowels(str);
        System.out.printf("There is %d vowels in this string",vowelCount);
    }
    public static int countVowels(String string){
        char[] strArr = string.toCharArray();

        String vowels = "AEIOUaeiou";
        int vowelCount =0;
        for (int i =0; i < strArr.length; i++){
            String butterypopcorn = Character.toString(strArr[i]);
            if (vowels.contains(butterypopcorn)){
                vowelCount++;
            }
        }
        return vowelCount;
    }
}

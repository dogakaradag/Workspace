package Example3;

public class Code {

    public static void main(String[] args) {
        String inputString = "ABC";
        permute(inputString, "");
    }

    public static void permute(String str, String answer) {
        if (str.length() == 0) {
            System.out.print(answer + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            StringBuilder remaining = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if (j != i) {
                    remaining.append(str.charAt(j));
                }
            }
            permute(remaining.toString(), answer + ch);
        }
    }
}
    

    

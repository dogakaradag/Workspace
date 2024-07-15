package Example2;

public class Code {

    
    public void solve(int n, char source, char aux, char des) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + des);
            return;
        }
        solve(n - 1, source, des, aux);
        //NEDEN n-1 Lİ İŞLEMLERİ PRINT ETMİYORUZ
        System.out.println("Move disk " + n + " from " + source + " to " + des);
        solve(n - 1, aux, source, des);
    }
}

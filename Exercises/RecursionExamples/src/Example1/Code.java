package Example1;
public class Code {

        public int gcd(int a, int b) {
           
            if (b == 0) {
                return a;
            }
            
            return gcd(b, a % b);
        }
    }
    

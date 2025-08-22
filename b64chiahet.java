import java.math.BigInteger;
import java.util.Scanner;

public class b64chiahet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String strA = sc.next();
            String strB = sc.next();
            BigInteger a = new BigInteger(strA);
            BigInteger b = new BigInteger(strB);

            if((b.mod(a).toString().equals("0")) || (a.mod(b).toString().equals("0"))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class b54HieuSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String StrA = sc.next();
            String StrB = sc.next();
            BigInteger A = new BigInteger(StrA);
            BigInteger B = new BigInteger(StrB);
            BigInteger result = A.subtract(B);
            result = result.abs();
            String resultStr = result.toString();
            int maxLeng = Math.max(StrA.length(), StrB.length());
            while(resultStr.length() < maxLeng) {
                resultStr = "0" + resultStr;
            }
            System.out.println(resultStr);
        }
        sc.close();
    }
}

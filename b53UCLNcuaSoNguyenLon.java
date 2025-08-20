import java.math.BigInteger;
import java.util.Scanner;


public class b53UCLNcuaSoNguyenLon {
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            String bStr = sc.next();
            BigInteger b = new BigInteger(bStr);
            if (a == 0) {
                System.out.println(b);
                continue;
            }

            BigInteger aStr = BigInteger.valueOf(a);
            BigInteger remain = b.remainder(aStr);
            long remainLong = remain.longValue();
            System.out.println(gcd(a, remainLong));
        }
        sc.close();
    }
}

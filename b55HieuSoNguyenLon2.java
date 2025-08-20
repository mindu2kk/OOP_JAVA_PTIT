/*
000123456789012345678901234567890
00000000000000001234567890
 */

import java.math.BigInteger;
import java.util.Scanner;

public class b55HieuSoNguyenLon2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);
        BigInteger result = aBig.subtract(bBig);
        System.out.println(result.abs());
        sc.close();
    }
}

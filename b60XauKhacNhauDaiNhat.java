import java.util.Scanner;

public class b60XauKhacNhauDaiNhat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int len1 = s1.length();
            int len2 = s2.length();
            if(len1 == len2 && s1.equals(s2)){
                System.out.println(-1);
            }
            else {
                int maxLength = Math.max(len1, len2);
                System.out.println(maxLength);
            }
        }
        sc.close();
    }
}

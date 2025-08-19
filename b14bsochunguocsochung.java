import java.util.Scanner;

public class b14bsochunguocsochung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long gcd = gcd(a, b);
            long lcm = (long)a * b / gcd;
            System.out.printf("%d %d", lcm,gcd);
            System.out.println();
        }
        sc.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
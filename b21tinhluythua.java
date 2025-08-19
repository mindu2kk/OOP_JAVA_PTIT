import java.util.Scanner;

public class b21tinhluythua{
    static final long m = 1000000007;
    public static long Solve(long a,long b){
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if (a == 1) {
            return 1;
        }
        if (b % 2 == 0) {
            long half = Solve(a, b / 2);
            return (half * half) % m;
        }
        else {
            return (a * Solve(a, b - 1)) % m;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        while(ok){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                ok = false;
                break;
            }
            System.out.println(Solve(a, b));
        }
        sc.close();
    }
}

import java.util.Scanner;
// This class is a placeholder for the factorial calculation problem.

public class b12tonggiaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long tong = 0;
        long gthua = 1;

        for(int i = 1;i <= n;i++){
            gthua *= i;
            tong += gthua;
        }
        System.out.println(tong);
        sc.close();
    }
}

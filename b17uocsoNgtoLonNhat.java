import java.util.Scanner;

public class b17uocsoNgtoLonNhat {
    public static long Solve(long n){
        long res = -1;
        while (n  % 2 == 0){
            n /= 2;
            res = 2;
        }

        for(int i = 3;i * i <= n;i += 2){
            while (n % i == 0){
                n /= i;
                res = i;
            }
        }
        if(n > 1){
            res = n;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t --> 0){
            long n = sc.nextLong();
            System.out.println(Solve(n));
        }
        sc.close();
    }
}
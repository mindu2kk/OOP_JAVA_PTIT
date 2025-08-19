import java.util.Scanner;

public class b22xauNhiPhan {
    static long[] f = new long[93];
    public static void fibo(){
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < 93; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    public static char find(int n,long k){
        if(n == 1){
            return '0';
        }
        if(n == 2){
            return '1';
        }
        if(k <= f[n - 2]){
            return find(n - 2, k);
        } else {
            return find(n - 1, k - f[n - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        fibo();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(find(n,k));
        }
        sc.close();
    }
}

import java.util.Scanner;

public class b9tinhfibo {
    public static void main(String[] args) {
        long[] fib = new long[93];

        fib[1] =1;
        fib[2] = 1;

        for (int i = 3; i <= 92; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            System.out.println(fib[n]);
        }
        sc.close();
    }
}

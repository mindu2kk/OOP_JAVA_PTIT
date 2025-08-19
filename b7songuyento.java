import java.util.Scanner;

public class b7songuyento {
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }

        for (int i = 2;i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (isPrime(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

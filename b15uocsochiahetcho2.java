import java.util.Scanner;

public class b15uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long n = sc.nextLong();

            if(n % 2 != 0){
                System.out.println(0);
            }
            else{
                System.out.println(cntDiv(n / 2));
            }
        }
        sc.close();
    }

    private static int cntDiv(long n){
        long cnt = 1;
        int exp = 0;

        while(n % 2 == 0){
            n /= 2;
            exp++;
        }
        cnt *= (exp + 1);

        for(long i = 3;i * i <= n;i++){
            exp = 0;
            while(n % i == 0){
                n /= i;
                exp++;
            }
            cnt *= (exp + 1);
        }
        if(n > 1){
            cnt *= 2; // n is prime
        }
        return (int) cnt;
    }
}

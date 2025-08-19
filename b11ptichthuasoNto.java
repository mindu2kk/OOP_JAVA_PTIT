import java.util.Scanner;

public class b11ptichthuasoNto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int test = 1;test <= t;test++) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", test);

            int cnt = 0;

            while (n % 2 == 0){
                cnt ++;
                n /= 2;
            }
            if (cnt > 0){
                System.out.printf("2(%d) ",cnt);
            }

            for(int i = 3;i * i <= n;i +=2){
                cnt = 0;
                while (n % i == 0){
                    cnt++;
                    n /= i;
                }
                if (cnt > 0){
                    System.out.printf("%d(%d) ",i,cnt);
                }
            }
            if(n > 1){
                System.out.printf("%d(1)",n);
            }
            System.out.println();
        }
        sc.close();
    }
}

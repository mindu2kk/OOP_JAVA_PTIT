import java.util.Scanner;
import java.util.Arrays;


public class b10ktrafibo {
    public static void main(String[] args) {
        long[] fibArr = new long[93];
        fibArr[1] = 1;
        fibArr[2] = 1;
        for (int i = 3;i < 93;i++){
            fibArr[i] = fibArr[i -1] + fibArr[i - 2];
        }

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T -->0){
            long n = sc.nextInt();

            if (Arrays.binarySearch(fibArr, n) >= 0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

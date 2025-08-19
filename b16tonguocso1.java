import java.util.Scanner;

public class b16tonguocso1 {

    static int MAX = 2000000;
    static int[] uoc = new int[MAX + 1];

    public static void sieve(){
        for(int i = 2;i < MAX;i++){
            uoc[i] = i;
        }

        for(int i = 2;i * i < MAX;i++){
            if(uoc[i] == i){
                for(int j = i * i;j < MAX;j += i){
                    if(uoc[j] == j){
                        uoc[j] = i;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;
        for(int i = 0;i < n;i++){
            int x = sc.nextInt();
            while(x != 1){
                total += uoc[x];
                x /= uoc[x];
            }
        }
        System.out.println(total);
        sc.close();
    }
}
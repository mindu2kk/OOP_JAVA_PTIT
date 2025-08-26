import java.util.Scanner;

public class b118HinhSao{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        int degree[] = new int[n + 1];

        for(int i = 0;i < n - 1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            degree[u]++;
            degree[v]++;
        }

        boolean check = false;

        for(int i = 0;i <= n;i++){
            if(degree[i] == n - 1){
                check = true;
                break;
            }
        }

        if(check){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}

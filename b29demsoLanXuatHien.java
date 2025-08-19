import java.util.*;

public class b29demsoLanXuatHien{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int test = 0;test < t;test++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] dem = new int[10001];

            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                dem[a[i]]++;
            }
            System.out.println("Test " + (test + 1) + ":");
            for(int i = 0;i < n;i++){
                if(dem[a[i]] > 0){
                    System.out.println(a[i] + " xuat hien " + dem[a[i]] + " lan");
                    dem[a[i]] = 0;
                }
            }
        }
        sc.close();
    }
}

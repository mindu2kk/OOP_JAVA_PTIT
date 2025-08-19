import java.util.*;

public class b28hop2dayso{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> unionSet = new TreeSet<>();

        for(int i = 0;i < n;i++){
            unionSet.add(sc.nextInt());
        }
        for(int i = 0;i < m;i++){
            unionSet.add(sc.nextInt());
        }

        for(int num:unionSet){
            System.out.print(num + " ");
        }
        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class b38LietKeToHop2{
    static int cnt = 0;
    public static void generateCombi(int start,List<Integer> currCombi, int n, int k){
        if(currCombi.size()== k){
           for(int num:currCombi){
                System.out.print(num);
           }
           System.out.print(" ");
           cnt++;
           return;
        }
        for(int i = start;i <= n;i++){
            currCombi.add(i);
            generateCombi(i + 1, currCombi, n, k);
            currCombi.remove(currCombi.size()-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> currCombi = new ArrayList<>();
        generateCombi(1, currCombi, n, k);
        System.out.println();
        System.out.println("Tong hop co "+cnt + " to hop");
        sc.close();
    }
}

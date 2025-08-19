import java.util.Scanner;

public class b35diemcanbang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int totalSum = 0;
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                totalSum += a[i];
            }

            int leftSum = 0;
            int rightSum;
            boolean found = false;
            for(int i = 0;i < n;i++){
                rightSum = totalSum - a[i] - leftSum;
                if(rightSum == leftSum){
                    System.out.println(i + 1);
                    found = true;
                    break;
                }
                leftSum += a[i];
            }
            if(!found){
                System.out.println(-1);
            }
        }
        sc.close();
    }
}

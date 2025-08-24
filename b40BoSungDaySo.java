import java.util.Scanner;

public class b40BoSungDaySo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxVal = arr[n - 1];
        int arrIndex = 0;
        boolean foundMissing = false;
        for(int i = 1;i <= maxVal;i++){
            if(arrIndex < n && arr[arrIndex] == i){
                arrIndex++;
            } else {
                System.out.println(i);
                foundMissing = true;
            }
        }
        if(!foundMissing){
            System.out.println("Excellent!");
        }
        sc.close();
    }
}

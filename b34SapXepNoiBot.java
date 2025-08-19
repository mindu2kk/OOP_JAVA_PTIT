import java.util.Scanner;

public class b34SapXepNoiBot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0;i < n - 1;i++){
            boolean swapped = false; // Biến để kiểm tra xem có hoán đổi nào xảy ra trong vòng lặp này không
            for(int j = 0;j < n - i - 1;j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swapped = true; // Đánh dấu là đã có hoán đổi
                }
            }
            if(!swapped) {
                break; // Nếu không có hoán đổi nào, mảng đã được sắp xếp
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int k = 0; k < n; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

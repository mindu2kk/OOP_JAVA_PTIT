/*
Hãy thực hiện thuật toán sắp xếp chọn trên dãy N số nguyên. Ghi ra các bước thực hiện thuật toán.
Dữ liệu vào: Dòng 1 ghi số N (không quá 100). Dòng 2 ghi N số nguyên dương (không quá 100).

Kết quả: Ghi ra màn hình từng bước thực hiện thuật toán.
Mỗi bước trên một dòng, các số trong dãy cách nhau đúng một khoảng trống.
 */
import java.util.*;
public class b32SapXepChon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < n - 1;i++){
            int minIdx = i;
            for(int j = i + 1;j < n;j++){
                if(a[i] > a[j] && a[j] < a[minIdx]){
                    minIdx = j;
                }
            }
            if(minIdx != i){
                int temp = a[minIdx];
                a[minIdx] = a[i];
                a[i] = temp;
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

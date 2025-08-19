/*
Hãy thực hiện thuật toán sắp xếp chèn trên dãy N số nguyên. Ghi ra các bước thực hiện thuật toán.
Dữ liệu vào: Dòng 1 ghi số N (không quá 100). Dòng 2 ghi N số nguyên dương (không quá 100).
Kết quả: Ghi ra màn hình từng bước thực hiện thuật toán. Mỗi bước trên một dòng,
các số trong dãy cách nhau đúng một khoảng trống.
 */

import java.util.Scanner;

public class b33SapXepChen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Buoc 0: "+ a[0]);
        for(int i = 1;i < n;i++){
            int key = a[i];
            int j = i - 1;

            while(j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            System.out.print("Buoc " + i + ": ");
            for(int k = 0; k < i + 1; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

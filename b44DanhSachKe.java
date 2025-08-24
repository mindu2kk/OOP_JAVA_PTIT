import java.util.Scanner;

public class b44DanhSachKe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print("List("+(i+1)+") = ");
            for(int j = 0;j < n;j++){
                if(matrix[i][j] == 1){
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

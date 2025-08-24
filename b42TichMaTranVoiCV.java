import java.util.Scanner;

public class b42TichMaTranVoiCV{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int test = 0; test < t; test++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            int[][] res = new int[n][n];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    res[i][j] = 0;
                    for(int k = 0;k < m;k++){
                        res[i][j] += matrix[i][k] * matrix[j][k];
                    }
                }
            }
            System.out.println("Test " + (test + 1) + ":");
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

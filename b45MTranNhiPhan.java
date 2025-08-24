import java.util.Scanner;

public class b45MTranNhiPhan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][3];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 3;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0;i < n;i++){
            int dem = 0;
            for(int j = 0;j < 3;j++){
                if(matrix[i][j] == 1){
                    dem++;
                }
            }
            if(dem > 3 - dem){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}

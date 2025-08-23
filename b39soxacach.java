import java.util.Scanner;

public class b39soxacach{
    static int n;
    static int[] currPermu;
    static boolean[] visited;
    public static void backtrack(int index){
        if(index == n){
            for(int i = 0; i < n; i++){
                System.out.print(currPermu[i]);
            }
            System.out.println();
            return;
        }
        for(int i = 1;i <= n;i++){
            if(!visited[i]){
                if(index > 0 && Math.abs(i - currPermu[index - 1]) == 1){
                    continue;
                }
                visited[i] = true;
                currPermu[index] = i;
                backtrack(index + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            n = sc.nextInt();
            currPermu = new int[n];
            visited = new boolean[n+1];
            backtrack(0);
        }
        sc.close();
    }
}

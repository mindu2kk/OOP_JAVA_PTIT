import java.util.Scanner;

public class b58XauDoiXung{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            if(checkOk(str)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean checkOk(String str){
        int n = str.length();
        int res = 0;
        for(int i = 0; i < n / 2; i++){
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                res += 1;
            }
        }
        if(res == 1){
            return true;
        }
        else if(res == 0 && n % 2 == 1){
            return true;
        }
        return false;
    }
}

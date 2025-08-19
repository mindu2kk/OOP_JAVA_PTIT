import java.util.Scanner;

public class b20soKhLienKe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t --> 0){
            String str = sc.next();
            int n = str.length();
            boolean ok = true;
            int sum = 0;
            for(int i = 0; i < n-1; i++){
                int curr = str.charAt(i) - '0';
                int next = str.charAt(i + 1) - '0';
                if(Math.abs(curr - next) != 2){
                    ok = false;
                    break;
                }
                sum += curr;
            }
            sum += str.charAt(n - 1) - '0';
            if(ok && sum % 10 == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

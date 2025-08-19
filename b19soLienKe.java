import java.util.Scanner;

public class b19soLienKe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String str = sc.next();
            int n = str.length();
            boolean ok = true;
            for(int i = 0;i < n -1;i++){
                int curr = str.charAt(i) - '0';
                int next = str.charAt(i + 1) - '0';
                if(Math.abs(curr - next) != 1){
                    ok = false;
                    break;
                }
            }
            if(ok){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

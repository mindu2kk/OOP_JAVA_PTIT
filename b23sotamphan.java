import java.util.Scanner;

public class b23sotamphan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String str = scanner.next();
            int n = str.length();
            boolean isTampan = true;
            for (int i = 0; i < n; i++) {
                int curr = str.charAt(i) - '0';
                if (curr > 2){
                    isTampan = false;
                    break;
                }

            }
            if (isTampan) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}

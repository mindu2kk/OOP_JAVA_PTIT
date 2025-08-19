import java.util.Scanner;

public class b18cs4va7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strg = sc.nextLine();

        int cnt = 0;
        for (char c : strg.toCharArray()){
            if (c == '4' || c == '7') {
                cnt++;
            }
        }

        if(cnt == 4 || cnt == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}

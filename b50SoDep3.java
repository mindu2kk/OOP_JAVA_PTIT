/*
3
123456787654321
235755557532
2222333355557777235775327777555533332222
 */

import java.util.Scanner;

public class b50SoDep3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String nStr = sc.nextLine();
            if(checkOk(nStr)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean checkOk(String nStr){
        for(char c:nStr.toCharArray()) {
            int digit = c - '0';
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                return false;
            }
        }
        int left = 0;
        int right = nStr.length() - 1;
        while(left < right){
            if(nStr.charAt(left) != nStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

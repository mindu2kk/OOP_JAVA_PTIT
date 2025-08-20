/*
4
123456787654321
8644281154664511824468
8006000444400000000000044440006008
82123400000000000000000000000432128
 */

import java.util.Scanner;

public class b49SoDep2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String nStr = sc.nextLine();
            if(CheckOK(nStr)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean CheckOK(String nStr){
        if(nStr.charAt(0) - '0' != 8){
            return false;
        }
        int sum = 0;
        int left = 0;
        int right = nStr.length() - 1;
        while(left < right) {
            if (nStr.charAt(left) != nStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        for(char c:nStr.toCharArray()){
            int digit = c - '0';
            sum += digit;
        }
        if(sum % 10 != 0){
            return false;
        }
        return true;
    }
}

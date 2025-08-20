/*
4
123456787654321
86442824468
8006000444422220000222244440006008
235365789787654324567856578654356786556
 */

import java.util.Scanner;

public class b48SoDep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0) {
            String nStr = sc.nextLine();
            if(CheckOk(nStr)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
    public static boolean CheckOk(String nStr){
        for(char c : nStr.toCharArray()){
            int digit = c - '0';
            if(digit % 2 != 0){
                return false; // Nếu có chữ số lẻ, trả về false
            }
        }

        int left = 0;
        int right = nStr.length() - 1;
        while(left < right) {
            if (nStr.charAt(left) != nStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

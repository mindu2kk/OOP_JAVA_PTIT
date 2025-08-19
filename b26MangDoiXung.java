import java.util.Scanner;

public class b26MangDoiXung{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int left = 0, right = n - 1;
            boolean isSymmetric = true;
            while (left < right) {
                if (arr[left] != arr[right]) {
                    isSymmetric = false;
                    break;
                }
                left++;
                right--;
            }
            if (isSymmetric) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

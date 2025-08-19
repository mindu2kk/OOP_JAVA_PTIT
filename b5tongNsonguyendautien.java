import java.util.Scanner;

public class b5tongNsonguyendautien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            long n =  input.nextLong();
            long sum = n * (n + 1) / 2;
            System.out.println(sum);
        }
        input.close();
    }
}

/*
Phương trình bậc nhất là phương trình dạng ax + b = 0.
Viết chương trình nhập vào hệ số a,b là các số thực và thực hiện giải phương trình bậc nhất.

Nếu phương trình vô nghiệm thì in ra VN
Nếu phương trình có vô số nghiệm thì in ra VSN
Nếu phương trình có nghiệm duy nhất thì in ra với định dạng luôn 2 chữ số thập phân.
Input

Chỉ có hai số thực a và b.

Output

Ghi ra kết quả theo yêu cầu.
*/
import java.util.Scanner;

public class b6giaiptbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0){
                System.out.println("VSN");
            }
            else {
                System.out.println("VN");
            }
        }
        else {
            double x = -b / a;
            System.out.printf("%.2f",x);
        }
        sc.close();
    }
}

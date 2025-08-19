import java.util.Scanner;

public class b4hinhchunhat {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        long chieuDai = sc.nextLong();
        long chieuRong = sc.nextLong();

        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println(0);
        } else {
            long chuVi = 2 * (chieuDai + chieuRong);
            long dienTich = chieuDai * chieuRong;

            System.out.println(chuVi + " " + dienTich);
        }

        sc.close();
    }
}

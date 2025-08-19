/*
Theo quy tắc viết tên tiếng Anh, họ tên sẽ thường được viết lại theo dạng chuẩn trong đó phần họ được viết sau cùng, phân tách với phần tên đệm và tên bởi dấu phẩy. Các chữ cái của phần họ đều viết hoa.
Cho trước các xâu họ tên (có thể không chuẩn). Hãy đưa về dạng chuẩn tương ứng.

Dữ liệu vào:
Dòng 1 ghi số N là xâu họ tên trong danh sách
N dòng tiếp theo ghi lần lượt các xâu họ tên (không quá 50 ký tự)
Kết quả: Ghi ra các xâu chuẩn.

4
 nGUYEn    quaNG   vInH
  tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
 */

import java.util.Scanner;

public class b47ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng mới sau khi đọc số lượng test case
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] words = input.trim().split("\\s+");

            String lastName = words[0].toUpperCase();
            StringBuilder res = new StringBuilder();

            for (int i = 1;i < words.length;i++){
                String word = words[i].toLowerCase();
                res.append(Character.toUpperCase(word.charAt(0)));
                res.append(word.substring(1));
                res.append(' ');
            }
            System.out.println(res.toString().trim() + ", " + lastName);
        }
        sc.close();
    }
}

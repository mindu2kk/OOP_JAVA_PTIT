import java.util.Scanner;

public class b46chuanhoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng mới sau khi đọc số nguyên
        while(t-->0){
            String input = sc.nextLine();
            String[] words = input.trim().split("\\s+"); // Tách chuỗi thành mảng từ, loại bỏ khoảng trắng thừa
            StringBuilder result = new StringBuilder();

            for(String word:words){
                if(word.isEmpty()){
                    continue; // Bỏ qua từ rỗng
                }
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" "); // Thêm khoảng trắng sau mỗi từ
            }
            System.out.println(result.toString().trim());
        }
        sc.close();
    }
}

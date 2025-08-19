/*
Dữ liệu văn bản chứa trong file Hello.txt

Yêu cầu đọc nội dung từ file văn bản Hello.txt và in kết quả ra màn hình.

Input:

Không có dữ liệu vào

Output:

Nội dung trong file văn bản Hello.txt
*/
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; 
public class b2hellofile {
    public static void main(String[] args) {
        String filePath = "Hello.txt"; // Đường dẫn đến file Hello.txt
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class b2hellofile {

    public static void main(String[] args) {
        // Tên file cần đọc
        String tenFile = "Hello.txt";

        try {
            // 1. Tạo đối tượng Path từ tên file
            Path duongDan = Path.of(tenFile);

            // 2. Đọc toàn bộ nội dung file thành một chuỗi (String)
            String noiDung = Files.readString(duongDan);

            // 3. In nội dung ra màn hình
            System.out.println(noiDung);

        } catch (IOException e) {
            // Xử lý nếu có lỗi xảy ra (ví dụ: file không tồn tại)
            System.out.println("Đã xảy ra lỗi: Không tìm thấy file hoặc không thể đọc file.");
            e.printStackTrace();
        }
    }
}
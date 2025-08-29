import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, soPhong, ngayDen, ngayDi;
    private Integer phu;

    public KhachHang(int id, String ten, String soPhong, String ngayDen, String ngayDi, Integer phu) {
        this.ma = "KH" + String.format("%02d", id);
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.phu = phu;
    }

    private long TinhSoNgay(String ngayDen,String ngayDi){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate ngayden = LocalDate.parse(ngayDen, dtf);
        LocalDate ngaydi = LocalDate.parse(ngayDi, dtf);
        return ChronoUnit.DAYS.between(ngayden, ngaydi) + 1;
    }

    private long DonGia(String soPhong){
        char c = soPhong.charAt(0);
        if(c == '1') return 25;
        else if(c == '2') return 34;
        else if(c == '3') return 50;
        else return 80;
    }

    private long ThanhTien(){
        return TinhSoNgay(ngayDen, ngayDi) * DonGia(soPhong) + phu;
    }

    private String chuanHoa(String ten){
        String[] parts = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String part : parts){
            sb.append(Character.toUpperCase(part.charAt(0)));
            sb.append(part.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public int compareTo(KhachHang other){
        return (int)(other.ThanhTien() - this.ThanhTien());
    }

    public String toString() {
        return ma + " " + chuanHoa(ten) + " " + soPhong + " " + TinhSoNgay(ngayDen, ngayDi) + " " + ThanhTien();
    }
}

public class b102TinhTienPhong{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String soPhong = sc.nextLine();
            String ngayDen = sc.nextLine();
            String ngayDi = sc.nextLine();
            Integer phu = Integer.parseInt(sc.nextLine());

            KhachHang kh = new KhachHang(i+1, ten, soPhong, ngayDen, ngayDi, phu);
            list.add(kh);
        }

        Collections.sort(list);
        for(KhachHang kh : list){
            System.out.println(kh);
        }
        sc.close();
    }
}

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class LuuTru implements Comparable<LuuTru>{
    private String ma, ten, maPhong;
    private long LTru;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public LuuTru(int stt,String ten, String maPhong, String ngayDen, String ngayDi) {
        this.ma = "KH" + String.format("%02d", stt);
        this.ten = ten;
        this.maPhong = maPhong;

        LocalDate den = LocalDate.parse(ngayDen, dtf);
        LocalDate di = LocalDate.parse(ngayDi, dtf);
        this.LTru = ChronoUnit.DAYS.between(den, di);
    }
    public int compareTo(LuuTru other){
        return Long.compare(other.LTru, this.LTru);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + maPhong + " " + LTru;
    }
}

public class b99danhsachluutru{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("MATHANG.in"));
            List<LuuTru> ltru = new ArrayList<>();
            int n = sc.nextInt();
            sc.nextLine();
            for(int i=0; i<n; i++){
                String ten = sc.nextLine();
                String maPhong = sc.nextLine();
                String ngayDen = sc.nextLine();
                String ngayDi = sc.nextLine();

                LuuTru lt = new LuuTru(i + 1,ten, maPhong, ngayDen, ngayDi);
                ltru.add(lt);
            }
            Collections.sort(ltru);
            for(LuuTru lt : ltru){
                System.out.println(lt);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

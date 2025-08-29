import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThiSinh2 implements Comparable<ThiSinh2>{
    private String ma, ten,trangThai;
    public double tong,ut;


    public ThiSinh2(String ma, String ten, double tong) {
        this.ma = ma;
        this.ten = ten;
        this.tong = tong;
        if(ma.charAt(2) == '1') this.ut = 0.5;
        else if(ma.charAt(2) == '2') this.ut = 1.0;
        else{
            this.ut = 2.5;
        }
        this.tong += this.ut;
    }

    private String formatDiem(double diem) {
        if (diem == (long) diem) {
            return String.format("%d", (long) diem);
        }
        return String.format("%.1f", diem);
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    private String ChuanHoa(String ten){
        String[] parts = ten.trim().toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for(String part : parts){
            if(part.length() > 0){
                sb.append(Character.toUpperCase(part.charAt(0)))
                  .append(part.substring(1))
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }

    public int compareTo(ThiSinh2 other) {
        int diemSoSanh = Double.compare(other.tong, this.tong);
        if (diemSoSanh == 0) {
            return this.ma.compareTo(other.ma);
        }
        return diemSoSanh;
    }

    @Override
    public String toString() {
        return ma + " " + ChuanHoa(ten) + " " + formatDiem(ut) + " " + formatDiem(tong) + " " + trangThai;
    }
}

public class b103dsTrungTuyen{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh2> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            double diem1 = sc.nextDouble();
            double diem2 = sc.nextDouble();
            double diem3 = sc.nextDouble();
            sc.nextLine();
            double tong = diem1 * 2 + diem2 + diem3;

            ThiSinh2 TS = new ThiSinh2(ma, ten, tong);
            list.add(TS);
        }


        int chitieu = sc.nextInt();
        Collections.sort(list);

        double diemChuan = list.get(chitieu - 1).tong;
        System.out.printf("%.1f\n", diemChuan);
        for (ThiSinh2 ts : list) {
            if (ts.tong >= diemChuan) {
                ts.setTrangThai("TRUNG TUYEN");
            } else {
                ts.setTrangThai("TRUOT");
            }
        }
        for(ThiSinh2 ts : list){
            System.out.println(ts);
        }
        sc.close();


    }
}

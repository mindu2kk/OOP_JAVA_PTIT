import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


class XetTuyen{
    private String ten,nsinh,ma,diemcuoi;
    private double d1,d2,diemtong;
    private long diemlamtron;

    public XetTuyen(int id, String ten, String nsinh, double d1, double d2) {
        this.ten = ten;
        this.nsinh = nsinh;
        this.d1 = d1;
        this.d2 = d2;
        this.ma = String.format("PH%02d", id);

        this.diemtong = (d1 + d2) / 2;
        if(d1 >= 8 && d2 >= 8) diemtong += 1;
        else if(d1 >= 7.5 && d2 >= 7.5) diemtong += 0.5;
        if(diemtong > 10) diemtong = 10;
        this.diemlamtron = Math.round(diemtong);

    }
    public String XetHang(double diemtong){
        if(diemlamtron >= 9) return "Xuat sac";
        else if(diemlamtron >= 8) return "Gioi";
        else if(diemlamtron >= 7) return "Kha";
        else if(diemlamtron >= 5) return "Trung binh";
        else return "Truot";
    }
    private String formatDiem(double diemtong) {

        if (diemtong == (int) diemtong) {
            return String.valueOf((int) diemtong);
        }
        else {
            return String.format("%.1f", diemtong);
        }
    }



    private String ChuanHoa(String ten){
        String[] paths = ten.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String part : paths){
            sb.append(Character.toUpperCase(part.charAt(0)));
            sb.append(part.substring(1));
            sb.append(" ");
        }
        return sb.toString().trim();
    }


    private int tinhTuoi(String nsinh){
        String[] parts = nsinh.split("/");
        int year = Integer.parseInt(parts[2]);
        return 2021 - year;
    }

    public String toString() {
        return ma + " " + ChuanHoa(ten) + " " + tinhTuoi(nsinh) + " " + Math.round(diemtong) + " " + XetHang(diemtong);
    }
}

public class b104XetTuyen{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<XetTuyen> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String nsinh = sc.nextLine();
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            if(sc.hasNextLine()) sc.nextLine();

            XetTuyen xt = new XetTuyen(i + 1,ten, nsinh, d1, d2);
            list.add(xt);
        }

        for(XetTuyen xt : list){
            System.out.println(xt);
        }
        sc.close();

    }
}

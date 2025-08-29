import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class XepLoai implements Comparable<XepLoai>{
    private String ten,ma;
    private double diem;
    private int stt;

    public XepLoai(int stt,String ten, double diem) {
        this.ma = String.format("SV%02d", stt);
        this.ten = ten;
        this.diem = diem;
    }

    public String getXepLoai(double diem){
        if(diem < 5) return "KEM";
        else if(diem < 6.5 && diem >= 5) return "TRUNG BINH";
        else if(diem < 8 && diem >= 6.5) return "KHA";
        else return "GIOI";
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

    public int compareTo(XepLoai other){
        return Double.compare(other.diem, this.diem);
    }

    @Override
    public String toString() {
        return ma + " " + chuanHoa(ten) + " " + String.format("%.2f", diem) + " " + getXepLoai(diem);
    }
}

public class b106XepLoai{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<XepLoai> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n;i++){
            String ten = sc.nextLine();
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            double d3 = sc.nextDouble();
            double diem = d1 * 0.25 + d2 * 0.35 + d3 * 0.40;
            if(sc.hasNextLine()) sc.nextLine();

            XepLoai xl = new XepLoai(i + 1,ten,diem);
            list.add(xl);
        }

        Collections.sort(list);
        for(XepLoai xl : list){
            System.out.println(xl);
        }
        sc.close();
    }
}

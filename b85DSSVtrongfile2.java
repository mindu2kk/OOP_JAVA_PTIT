import java.io.File;
import java.util.Scanner;

class SinhVien2{
    private String msv,hoTen,lop,ngaySinh;
    private double gpa;

    public SinhVien2(int msv, String hoTen, String lop, String ngaySinh, double gpa) {
        this.msv = "B20DCCN" + String.format("%03d", msv);
        this.hoTen = hoTen;
        this.lop = lop;
        if(ngaySinh.charAt(1) == '/'){
            ngaySinh = "0" + ngaySinh;
        }
        if(ngaySinh.charAt(4) == '/'){
            ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3);
        }
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public String toString(){
        return msv + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}

public class b85DSSVtrongfile2{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("SV.in"));
            int n = sc.nextInt();
            sc.nextLine();
            for(int i = 0;i < n;i++){
                String hoTen = sc.nextLine();
                String lop = sc.nextLine();
                String ngaySinh = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());

                SinhVien2 sv = new SinhVien2(i + 1, hoTen, lop, ngaySinh, gpa);
                System.out.println(sv);
            }
            sc.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}

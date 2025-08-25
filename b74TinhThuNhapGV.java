import java.util.Scanner;
class GiaoVien{
    private String maGv, hoTen;
    private long luongCoBan, thuNhap;

    public GiaoVien(String maGv, String hoTen, long luongCoBan) {
        this.maGv = maGv;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    public String toString(){
        int bacLuong = Integer.parseInt(maGv.substring(2, 4));
        int phuCap = 0;
        if(maGv.substring(0, 2).equals("HT")){
            phuCap = 2000000;
        } else if(maGv.substring(0, 2).equals("HP")){
            phuCap = 900000;
        } else {
            phuCap = 500000;
        }
        thuNhap = luongCoBan * bacLuong + phuCap;
        return maGv + " " + hoTen + " " + bacLuong + " " + phuCap + " " + thuNhap;
    }
}

public class b74TinhThuNhapGV{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maGV = sc.nextLine();
        String hoTen = sc.nextLine();
        long luongCoBan = sc.nextLong();
        GiaoVien gs = new GiaoVien(maGV, hoTen, luongCoBan);
        System.out.println(gs);
        sc.close();
    }
}

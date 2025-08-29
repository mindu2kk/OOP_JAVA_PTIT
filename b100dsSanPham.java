import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private int gia, baohanh;
    private static int sma = 1;

    public SanPham(String ma,String ten, int gia, int baohanh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.baohanh = baohanh;
    }

    public int compareTo(SanPham other){
        if(this.gia == other.gia){
            return this.ma.compareTo(other.ma);
        }
        else{
            return Integer.compare(other.gia, this.gia);
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + baohanh;
    }
}

public class b100dsSanPham{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        List<SanPham> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int baohanh = Integer.parseInt(sc.nextLine());

            SanPham sp = new SanPham(ma, ten, gia, baohanh);
            ds.add(sp);
        }
        Collections.sort(ds);
        for(SanPham sp : ds){
            System.out.println(sp);
        }
    }
}

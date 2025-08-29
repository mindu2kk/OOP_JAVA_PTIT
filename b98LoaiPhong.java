import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong> {
    private String kyHieu, ten;
    private int donGia;
    private double phiPhucVu;

    public LoaiPhong(String line) {
        String[] parts = line.trim().split("\\s+");

        this.kyHieu = parts[0];
        this.ten = parts[1];
        this.donGia = Integer.parseInt(parts[2]);
        this.phiPhucVu = Double.parseDouble(parts[3]);
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.ten.compareTo(other.ten);
    }

    @Override
    public String toString() {
        return kyHieu + " " + ten + " " + donGia + " " + phiPhucVu;
    }
}

public class b98LoaiPhong {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main577941(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}

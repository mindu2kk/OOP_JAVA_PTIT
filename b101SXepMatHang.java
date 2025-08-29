import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHang2 implements Comparable<MatHang2>{
    private String ma, ten, nhom;
    private float giaMua, giaBan;

    public MatHang2(int id, String ten, String nhom, float giaMua, float giaBan) {
        this.ma = String.format("MH%02d", id);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public float loiNhuan(){
        return giaBan - giaMua;
    }

    public int compareTo(MatHang2 other) {
        return Float.compare(other.loiNhuan(), this.loiNhuan());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f",loiNhuan());
    }
}
public class b101SXepMatHang{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang2> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            MatHang2 mh = new MatHang2(i + 1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            list.add(mh);
        }
        Collections.sort(list);
        for(MatHang2 a : list){
            System.out.println(a);
        }
        sc.close();
    }
}

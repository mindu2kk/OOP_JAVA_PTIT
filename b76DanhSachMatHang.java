import java.util.*;

class MatHang implements Comparable<MatHang>{
    private String maHang,ten,donvi;
    private int giaban, giamua, loinhuan;
    private int stt;
    public MatHang(int stt, String ten, String donvi, int giamua, int giaban){
        this.maHang = "MH" + String.format("%03d", stt);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
    }

    public int compareTo(MatHang other){
        if(this.loinhuan != other.loinhuan){
            return other.loinhuan - this.loinhuan;
        } else {
            return this.maHang.compareTo(other.maHang);
        }
    }

    public String toString(){
        return this.maHang + " " + this.ten + " " + this.donvi + " " + this.giamua + " " + this.giaban + " " + this.loinhuan;
    }
}

public class b76DanhSachMatHang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MatHang> danhsach = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            int stt = i + 1;
            sc.nextLine();
            String ten = sc.nextLine();
            String donvi = sc.nextLine();
            int giamua = sc.nextInt();
            int giaban = sc.nextInt();
            danhsach.add(new MatHang(i + 1, ten, donvi, giamua, giaban));
        }
        Collections.sort(danhsach);
        for(MatHang m : danhsach){
            System.out.println(m);
        }
        sc.close();
    }
}



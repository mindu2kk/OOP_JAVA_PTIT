import java.io.File;
import java.util.*;

class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma, ten, so;

    public DoanhNghiep(String ma, String ten, String so) {
        this.ma = ma;
        this.ten = ten;
        this.so = so;
    }

    public int compareTo(DoanhNghiep dn){
        return this.ma.compareTo(dn.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + so;
    }
}

public class b96danhsachdoanhnghiep{
    public static void main(String[] args) {
        try{
           Scanner sc = new Scanner(new File("DN.in"));
           List<DoanhNghiep> list = new ArrayList<>();
           int n = sc.nextInt();
           sc.nextLine();
           for(int i = 0;i < n;i++){
               String ma = sc.nextLine();
               String ten = sc.nextLine();
               String so = sc.nextLine();

               DoanhNghiep dn = new DoanhNghiep(ma,ten,so);
               list.add(dn);
           }
            Collections.sort(list);
            for(DoanhNghiep dn : list){
                System.out.println(dn);
            }
            sc.close();
        }
        catch(Exception e){
            return;
        }
    }
}

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc2 implements Comparable<MonHoc2>{
    private String ma, ten, hinhthuc;

    public MonHoc2(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    public int compareTo(MonHoc2 other){
        return this.ma.compareTo(other.ma);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhthuc;
    }
}

public class b109DSMonThi{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc2> list = new ArrayList<MonHoc2>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hinhthuc = sc.nextLine();
            MonHoc2 mh = new MonHoc2(ma, ten, hinhthuc);
            list.add(mh);
        }
        Collections.sort(list);
        for(MonHoc2 mh : list){
            System.out.println(mh);
        }
        sc.close();
    }
}

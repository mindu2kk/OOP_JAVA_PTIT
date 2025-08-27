import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String ma, ten;
    private int stc;

    public MonHoc(String ma, String ten, int stc) {
        this.ma = ma;
        this.ten = ten;
        this.stc = stc;
    }

    public int compareTo(MonHoc mh){
        return this.ten.compareTo(mh.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + stc;
    }
}

public class b95danhsachmonhoc{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = sc.nextInt();
            sc.nextLine();
            List<MonHoc> mon = new ArrayList<>();

            for(int i = 0; i < n; i++){
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                int stc = sc.nextInt();
                if(sc.hasNextLine()) sc.nextLine();
                mon.add(new MonHoc(ma, ten, stc));
            }
            Collections.sort(mon);
            for(MonHoc mh : mon){
                System.out.println(mh);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

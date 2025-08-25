import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ThoiGian implements Comparable<ThoiGian>{
    private int gio,phut,giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int compareTo(ThoiGian tg){
        if(this.gio != tg.gio) return this.gio - tg.gio;
        if(this.phut != tg.phut) return this.phut - tg.phut;
        return this.giay - tg.giay;
    }

    public String toString(){
        return this.gio + " " + this.phut + " " + this.giay;
    }

}

public class b75SapXepTG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ThoiGian> danhsach = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            danhsach.add(new ThoiGian(gio, phut, giay));
        }

        Collections.sort(danhsach);
        for(ThoiGian tg : danhsach){
            System.out.println(tg);
        }
        sc.close();
    }
}

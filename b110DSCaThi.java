import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class CaThi implements Comparable<CaThi>{
    private String name, date, time, phong;
    private LocalDateTime TGThi;
    private String ma;
    private int stt;

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


    public CaThi(int stt, String date, String time, String phong) {
        this.ma = String.format("C%03d", stt);
        this.date = date;
        this.time = time;
        this.phong = phong;
        this.TGThi = LocalDateTime.parse(date + " " + time, dtf);
    }

    public int compareTo(CaThi other){
        if(this.TGThi.compareTo(other.TGThi) == 0) {
            return this.ma.compareTo(other.ma);
        }
        return this.TGThi.compareTo(other.TGThi);
    }

    @Override
    public String toString() {
        return ma + " " + date + " " + time + " " + phong;
    }
}

public class b110DSCaThi{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> list = new ArrayList<CaThi>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < n;i++){
            String date = sc.nextLine();
            String time = sc.nextLine();
            String phong = sc.nextLine();
            CaThi ct = new CaThi(i + 1,date,time,phong);
            list.add(ct);
        }
        Collections.sort(list);
        for(CaThi ct : list){
            System.out.println(ct);
        }
        sc.close();
    }
}

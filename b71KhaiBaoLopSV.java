import java.util.Scanner;

class SinhVien{
    private String ten,lop,ns;
    private float gpa;

    public SinhVien(String ten, String lop, String ns, float gpa){
        this.ten = ten;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
    }
    public String toString(){
        if(ns.charAt(1) == '/'){
            ns = "0" + ns;
        }
        if(ns.charAt(4) == '/'){
            ns = ns.substring(0,3) + "0" + ns.substring(3);
        }
        return "B20DCCN001 " + ten + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}

public class b71KhaiBaoLopSV{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ns = sc.nextLine();
        float gpa = sc.nextFloat();
        SinhVien sv = new SinhVien(ten, lop, ns, gpa);
        System.out.println(sv);
        sc.close();
    }
}

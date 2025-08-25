import java.util.Scanner;

class ThiSinh{
    private String ten, ns;
    private float d1, d2, d3;

    public ThiSinh(String ten, String ns, float d1, float d2, float d3) {
        this.ten = ten;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String toString(){
        float tongdiem = d1 + d2 + d3;
        return ten + " " + ns + " " + String.format("%.1f", tongdiem);
    }
}

public class b70khaibaolopthisinh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ns = sc.nextLine();
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();

        ThiSinh ts = new ThiSinh(ten, ns, d1, d2, d3);
        System.out.println(ts);
    }
}

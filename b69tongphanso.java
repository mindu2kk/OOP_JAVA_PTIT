import java.util.Scanner;

class PhanSo2{
    private long x;
    private long y;

    public PhanSo2(long x,long y){
        this.x = x;
        this.y = y;
    }

    public long gcd(long x,long y){
        if(y == 0) return x;
        return gcd(y, x % y);
    }

    public PhanSo2 cong(PhanSo2 p) {
        long tu = this.x * p.y + this.y * p.x;
        long mau = this.y * p.y;
        long gcd = gcd(Math.abs(tu), Math.abs(mau));
        tu /= gcd;
        mau /= gcd;

        System.out.println(tu + "/" + mau);
        return new PhanSo2(tu, mau);
    }
}

public class b69tongphanso{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();

        PhanSo2 ps = new PhanSo2(tu1, mau1);
        PhanSo2 ps2 = new PhanSo2(tu2, mau2);
        PhanSo2 tong = ps.cong(ps2);
    }
}

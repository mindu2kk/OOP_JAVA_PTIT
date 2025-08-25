import java.util.Scanner;

class PhanSo{
    private long tu;
    private long mau;

    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }

    private long gcd(long tu,long mau){
        if(tu == 0){
            return mau;
        }
        return gcd(mau % tu, tu);
    }
    public void rutGon(){
        long gcd = gcd(tu,mau);
        this.tu = tu/gcd;
        this.mau = mau/gcd;
    }
    public String toString(){
        return this.tu + "/" + this.mau;
    }
}


public class b68PhanSo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();

        PhanSo ps = new PhanSo(tu,mau);
        ps.rutGon();

        System.out.println(ps);
        sc.close();
    }
}

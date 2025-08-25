import java.util.Scanner;

class PhanSo{
    private long tuSo;
    private long mauSo;

    public PhanSo(long tuSo, long mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private long timUCLN(long a, long b){
        if(b == 0) return a;
        return timUCLN(b, a % b);
    }

    public void rutGon(){
        long ucln = timUCLN(this.tuSo,this.mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }

    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}



public class b68PhanSo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();

        PhanSo ps = new PhanSo(tu, mau);
        ps.rutGon();
        System.out.println(ps);
        sc.close();
    }
}

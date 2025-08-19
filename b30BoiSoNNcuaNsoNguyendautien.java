import java.math.BigInteger;
import java.util.*;

public class b30BoiSoNNcuaNsoNguyendautien{
    static BigInteger[] res = new BigInteger[101];
    public static void solve(){
        res[1] = BigInteger.ONE;
        for(int i = 2;i <= 100;i++){
            BigInteger currNum = BigInteger.valueOf(i);
            BigInteger prevNum = res[i - 1];
            BigInteger gcd = prevNum.gcd(currNum);

            res[i] = prevNum.multiply(currNum).divide(gcd);
        }
    }


    public static void main(String[] args){
        solve();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(res[n]);
        }
        sc.close();
    }
}

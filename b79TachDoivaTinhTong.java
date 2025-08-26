import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class b79TachDoivaTinhTong{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            String s = sc.next();

            while(s.length() > 1){
                int n = s.length();
                int split = n / 2;
                String s1 = s.substring(0, split);
                String s2 = s.substring(split, n);
                BigInteger Num1 = new BigInteger(s1);
                BigInteger Num2 = new BigInteger(s2);
                s = Num1.add(Num2).toString();
                System.out.println(s);
            }
            sc.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class b86SoNTotrgFileNP{
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] cnt = new int[10001];
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
            ArrayList<Integer> List = (ArrayList<Integer>) ois.readObject();
            for(int num:List){
                if(isPrime(num)){
                    cnt[num]++;
                }
            }
            ois.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0;i < 10001;i++){
            if(cnt[i] > 0){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}

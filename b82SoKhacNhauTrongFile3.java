import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class b82SoKhacNhauTrongFile3{
    public static void main(String[] args) throws Exception{
        int[] cnt = new int[1001];
        try{
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> list = (ArrayList<Integer>) os.readObject();
            for(int number : list){
                cnt[number]++;
            }
            os.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        for(int i = 0;i < 1000;i++){
            if(cnt[i] > 0){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}

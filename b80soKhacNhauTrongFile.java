import java.io.File;
import java.util.*;

public class b80soKhacNhauTrongFile{
    public static void main(String[] args) {
        Map<Integer,Integer> Freqmap = new TreeMap<>();
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNextInt()){
                int number = sc.nextInt();
                Freqmap.put(number,Freqmap.getOrDefault(number,0)+1);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Liệt kê các số tăng dần, ví dụ:");

        for(Map.Entry<Integer,Integer> entry:Freqmap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

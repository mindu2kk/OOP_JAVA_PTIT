import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class b83lietketuKhacNhau{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        try{
            Scanner sc = new Scanner(new File("VANBAN.in"));
            while(sc.hasNext()){
                String s = sc.next().toLowerCase();
                set.add(s);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        for(String s: set){
            System.out.println(s);
        }
    }
}

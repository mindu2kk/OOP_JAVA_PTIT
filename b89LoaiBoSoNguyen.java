import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class b89LoaiBoSoNguyen{
    static Set<String> set = new TreeSet<String>();
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                String s = sc.next();
                try{
                    Integer.parseInt(s);
                }
                catch (NumberFormatException e){
                    set.add(s);
                }
            }

            sc.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for(String s: set){
            System.out.print(s + " ");
        }
    }
}

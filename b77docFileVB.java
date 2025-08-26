import java.io.*;
import java.util.*;

public class b77docFileVB{
    public static void main(String[] args) {
        try{
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

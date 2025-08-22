import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class b63DanhDauChuCai{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Set<Character> set = new HashSet<Character>();
        for(char c: str.toCharArray()) {
            set.add(c);
        }
        System.out.println(set.size());
        sc.close();
    }
}

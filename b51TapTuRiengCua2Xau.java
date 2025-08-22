import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class b51TapTuRiengCua2Xau{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input
        while(t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] words1 = s1.split("\\s+");
            String[] words2 = s2.split("\\s+");

            Set<String> set1 = new TreeSet<>();
            for(String word : words1) {
                set1.add(word);
            }
            Set<String> set2 = new TreeSet<>();
            for(String word : words2) {
                set2.add(word);
            }
            set1.removeAll(set2);
            for(String word : set1) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

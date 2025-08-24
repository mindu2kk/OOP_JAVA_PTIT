import java.util.Scanner;

public class b61daotu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0) {
            String str = sc.nextLine();
            String[] words = str.split(" ");
            StringBuilder res = new StringBuilder();
            for(int i = 0;i < words.length;i++){
                String word = words[i];
                String reversedWord = new StringBuilder(word).reverse().toString();
                res.append(reversedWord);
                if(i < words.length - 1){
                    res.append(" ");
                }
            }
            System.out.println(res.toString());
        }
        sc.close();
    }
}

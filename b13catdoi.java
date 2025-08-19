import java.util.Scanner;

public class b13catdoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t --> 0){
            String inputStr = sc.nextLine();
            solve(inputStr);
        }
        sc.close();
    }

    public static void solve(String s){
        StringBuilder transStr = new StringBuilder();
        boolean ok = true;

        for(char c : s.toCharArray()){
            if (c == '0' || c == '8' || c == '9'){
                transStr.append('0');
            }
            else if (c == '1'){
                transStr.append('1');
            }
            else{
                ok = false;
                break;
            }
        }
        long result = Long.parseLong(transStr.toString());
        if(!ok){
            System.out.println("INVALID");
        }
        else{
            if (result == 0){
                System.out.println("INVALID");
            }
            else{

                System.out.println(result);
            }
        }
    }

}
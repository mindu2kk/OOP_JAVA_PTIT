import java.util.Scanner;
import java.util.Stack;

public class b60RutGonXauKiTu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(!stack.isEmpty()&&stack.peek()==ch){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        if(stack.isEmpty()){
            System.out.println("Empty String");
        }
        else{
            StringBuilder res = new StringBuilder();
            for(char c: stack){
                res.append(c);
            }
            System.out.println(res.toString());
        }
        sc.close();
    }
}

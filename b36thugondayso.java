import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class b36thugondayso{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0;i < n;i++){
            int currNum = sc.nextInt();

            if(stack.isEmpty()){
                stack.push(currNum);
            }
            else{
                int topNum = stack.peek();
                if((currNum % 2) == (topNum % 2)){
                    stack.pop();
                }
                else{
                    stack.push(currNum);
                }
            }
        }
        System.out.println(stack.size());
        sc.close();
    }
}

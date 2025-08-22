import java.util.Scanner;

public class b65biensodep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int[] a = new int[5];
            a[0] = str.charAt(5) - '0';
            a[1] = str.charAt(6) - '0';
            a[2] = str.charAt(7) - '0';
            a[3] = str.charAt(9) - '0';
            a[4] = str.charAt(10) - '0';
            if(BienDep(a)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean BienDep(int[] a){
        return check1(a) || check2(a) || check3(a);

    }

    public static boolean check1(int[] a){
        return (a[0] == a[1] && a[0] == a[2] && a[3] == a[4]);
    }

    public static boolean check2(int[] a){
        for(int i : a){
            if(i != 6 && i != 8){
                return false;
            }
        }
        return true;
    }
    public static boolean check3(int[] a){
        for(int i = 1;i < 5;i++){
            if(a[i] <= a[i - 1]){
                return false;
            }
        }
        return true;
    }
}

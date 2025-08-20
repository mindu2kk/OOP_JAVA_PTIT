/*
Cho một số nguyên dương lớn có nhiều hơn 20 chữ số nhưng không quá 1000 chữ số.
Một số nguyên dương được coi là “số ưu thế chẵn” nếu số chữ số của nó là chẵn và số chữ số chẵn nhiều hơn số chữ số lẻ.
Một số nguyên dương được coi là “số ưu thế lẻ” nếu số chữ số của nó là lẻ và số chữ số lẻ nhiều hơn số chữ số chẵn.
Hãy kiểm tra xem số đó có phải là số ưu thế (chẵn hoặc lẻ) hay không.
 Chú ý: trường hợp số lượng chữ số chẵn và số lượng chữ số lẻ bằng nhau thì không được coi là số ưu thế.

Dữ liệu vào
Dòng đầu ghi số bộ test, không quá 10
Mỗi bộ test là một dãy ký tự có độ dài không quá 1000, không có khoảng trống

Kết quả
Nếu dữ liệu vào không phải là một số nguyên hợp lệ (có ký tự không phải số hoặc bắt đầu bằng chữ số 0) thì in ra INVALID
Nếu dữ liệu vào thỏa mãn là số ưu thế thì in ra YES, nếu không in ra NO
 */

import java.util.Scanner;

public class b57SoUuThe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            CheckOk(s);
        }
        sc.close();
    }
    public static void CheckOk(String s){
        int chan = 0;
        int le = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9' || (s.charAt(0) == '0' && s.length() > 1)){
                System.out.println("INVALID");
                return;
            }
            if((s.charAt(i) - '0') % 2 == 0){
                chan++;
            }else{
                le++;
            }
        }
        if(chan == le){
            System.out.println("NO");
            return;
        }
        else if(le > chan && s.length() % 2 == 1){
            System.out.println("YES");
            return;
        }
        else if(chan > le && s.length() % 2 == 0){
            System.out.println("YES");
            return;
        }

        else{
            System.out.println("NO");
            return;
        }
    }
}

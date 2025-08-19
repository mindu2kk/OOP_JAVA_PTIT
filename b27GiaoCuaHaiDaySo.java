/*
Cho dãy số a[] có n phần tử và dãy số b[] có m phần tử là các số nguyên dương nhỏ hơn 1000.
Gọi tập hợp A là tập các số khác nhau trong a[], tập hợp B là tập các số khác nhau trong b[].
Hãy tìm tập giao của A và B.

Input
Dòng đầu ghi 2 số n và m (1 < n,m <100).
Dòng thứ 2 ghi n số của a[].
Dòng thứ 3 ghi m số của b[].
Các số đều dương và nhỏ hơn 1000.

Output
Ghi tập giao của A và B trên một dòng theo thứ tự từ nhỏ đến lớn.
*/

import java.util.*;

public class b27GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0;i < n;i++){
            setA.add(sc.nextInt());
        }

        for(int i = 0;i < m;i++){
            setB.add(sc.nextInt());
        }

        setA.retainAll(setB);

        List<Integer> result = new ArrayList<>(setA);
        Collections.sort(result);

        for(int num:result){
            System.out.print(num + " ");
        }
        sc.close();
    }
}

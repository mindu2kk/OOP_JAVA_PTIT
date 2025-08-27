import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class SinhVien3 implements Comparable<SinhVien3>{
    private String msv, name, lop, email;

    private String chuanHoa(String name) {
        String[] parts = name.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            if (part.length() > 0) {
                sb.append(Character.toUpperCase(part.charAt(0)))
                        .append(part.substring(1))
                        .append(" ");
            }
        }
        return sb.toString().trim();
    }
    public SinhVien3(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = chuanHoa(name);
        this.lop = lop;
        this.email = email;
    }

    public int compareTo(SinhVien3 other) {
        return this.msv.compareTo(other.msv);
    }
    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }

}

public class b94DSSinhVientrongFile1{
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new java.io.File("MONHOC.in"));
            int n = sc.nextInt();
            List<SinhVien3> list = new ArrayList<>();
            sc.nextLine();
            for(int i = 0; i < n; i++){
                String msv = sc.nextLine();
                String name = sc.nextLine();
                String lop = sc.nextLine();
                String email = sc.nextLine();

                SinhVien3 sv = new SinhVien3(msv, name, lop, email);
                list.add(sv);
            }
            Collections.sort(list);
            for(SinhVien3 sv : list){
                System.out.println(sv);
            }
            sc.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}

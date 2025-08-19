import java.util.Scanner;
import java.lang.Math;

public class b24HVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int minX = Math.min(x1, x3);
        int minY = Math.min(y1, y3);
        int maxX = Math.max(x2, x4);
        int maxY = Math.max(y2, y4);

        int width = maxX - minX;
        int height = maxY - minY;

        int edge = Math.max(width, height);
        long area = (long) edge * edge;
        System.out.println(area);
        sc.close();

    }
}

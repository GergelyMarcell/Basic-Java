import java.util.Scanner;

public class Tomb03 {
    static  void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tömb mérete: ");
        int size = sc.nextInt();

        String [] t = new String[size];
        int db = 0;
        while (db != size) {
            System.out.println("Adat: ");
            t[db] = sc.next();
            db++;
        }
        for (int i = 0; i < t.length; i++) System.out.println(i + "; ");
    }
}

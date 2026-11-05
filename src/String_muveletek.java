import java.util.Scanner;

public class String_muveletek {
    static  void main() {
        Scanner sc = new Scanner(System.in);
        // 2.
        System.out.print("Vezetéknév: ");
        String vnev = sc.nextLine();
        System.out.print("Keresztnáv: ");
        String knev = sc.nextLine();
        System.out.print("Születési hely: ");
        String szhely = sc.nextLine();
        System.out.print("Kor: ");
        int kor = sc.nextInt();

        // 3.
        String fullName = vnev + " " + knev;

        // 4.
        System.out.println(fullName.toUpperCase());

        // 5.
        System.out.println(fullName.indexOf(knev));

        // 6.
        System.out.println((fullName + " " + szhely).toLowerCase());

        // 7.
        System.out.println(kor + " " + szhely + " " + fullName);

        // 8.
        System.out.println(knev.toUpperCase().startsWith("A") ? "Igen" : "Nem");

        // 9.
        System.out.println(vnev.toLowerCase().endsWith("t")? "Igen" : "Nem");

        // 10.
        System.out.println(fullName.length());

        // 11.
        System.out.println(fullName.replace('i', 'y'));
    }
}

import java.util.Scanner;

public class Operatorok {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy stringet!");
        String szoveg = sc.nextLine();
        System.out.println("Adjon meg 1 karakter!");
        char karakter1 = sc.nextLine().charAt(0);
        System.out.println("Adjon meg még1 karakter!");
        char karakter2 = sc.nextLine().charAt(0);
        System.out.println("Adjon meg 1 integert!");
        int int1 = sc.nextInt();
        System.out.println("Adjon meg még1 integert!");
        int int2 = sc.nextInt();
        System.out.println("Adjon meg 1 double-t!");
        double double1 = sc.nextDouble();
        System.out.println("Adjon meg még1 double-t!");
        double double2 = sc.nextDouble();

        String osszerak = szoveg + karakter1 + karakter2;
        double oszt = (double) int1 / int2;
        double osszead = double1 + double2;

        double kivonas = Double.parseDouble(String.valueOf(int1)) - osszead;
        double szorzas = Double.parseDouble(String.valueOf(int2)) * osszead;

        System.out.println("String és karakterek összerakása:" + osszerak);
        System.out.println("Két integer elosztása: " + oszt);
        System.out.println("Két tizedes szám összeadása: " + osszead);
        System.out.println("Double szám kivonása az egyik integerből: " + osszead);
        System.out.println("Double szám és a másik integer össze szorzása: " + szorzas);

    }
}
import java.util.Scanner;

public class SzovegErtekeles {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Egesz szam: ");
        int sz = sc.nextInt();

        switch (sz) {
            case 1:
                System.out.println("elégtelen");break;
            case 2:
                System.out.println("elégseges");break;
            case 3:
                System.out.println("közepes");break;
            case 4:
                System.out.println("jó");break;
            case 5:
                System.out.println("jeles");break;
            default:
                System.out.println("Nincs ilyen jegy");break;
        }
    }
}

import java.util.Scanner;

public class Soutln {
    static void main() {
        String msg = "I'm happy today.";
        int a = 150;
        int o = 0226;
        int h = 0x96;
        double d = 10;
        System.out.println(msg);
        System.out.println(a);
        System.out.println(o);
        System.out.println(h);
        System.out.println(d);
        //-----------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Mi a kedvenc zeneszámod?");
        String zene = sc.nextLine();
        System.out.println("Mi a kedvenc ételed?");
        String kaja = sc.nextLine();
        System.out.println("Mi a kedvenc hobbid?");
        String hobbi = sc.nextLine();
        System.out.println("Mi a kedvenc filmed?");
        String film = sc.nextLine();
        System.out.println("Mi a kedvenc uticélod?");
        String uticel = sc.nextLine();
        //------------------------------
        System.out.println("A kedvenc zeneszámod: " + zene);
        System.out.println("A kedvenc ételed: " + kaja + ", hobbid: " + hobbi);
        System.out.println("Kedvenc filmed: " + film);
        System.out.println("Uticélod: " + uticel);

    }
}

import java.util.Scanner;

public class SoutIn {
    static  void main(){
        //1. feladat
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
        // 2. feladat
        Scanner sc = new Scanner(System.in);
        System.out.println("Mi a kedvenc zeneszámod?");
        String music = sc.next();
        System.out.println("Mi a kedvenc ételed?");
        String food = sc.next();
        System.out.println("Mi a kedvenc hobbid?");
        String hobby = sc.next();
        System.out.println("Mi a kedvenc filmed?");
        String movie = sc.next();
        System.out.println("Mi a kedvenc uticélod?");
        String destination = sc.next();
        //3. feladat
        System.out.println("A kedvenc zeneszámod: " + music);
        System.out.println("A kedvenc ételed: " + food);
        System.out.println("A kedvenc hobbid: " + hobby);
        System.out.println("A kedvenc filmed: " + movie);
        System.out.println("A kedvenc uticélod: " + destination);
    }
}

import java.util.Scanner;

public class String_muveletek{
    static void main() {

        //2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy vezetéknevet!");
        String vnev = sc.nextLine();

        System.out.println("Kérek egy keresztnevet!");
        String knev = sc.nextLine();

        System.out.println("Kérek egy születési helyet!");
        String szulhely = sc.nextLine();

        System.out.println("Kérek egy életkort!");
        int eletkor = sc.nextInt();

        //3.
        String fullname = vnev + " " + knev;

        //4.
        System.out.println(fullname.toUpperCase());

        //5.
        int index = fullname.indexOf(knev);
        System.out.println(index);

        //6.
        System.out.println(fullname + ", " + szulhely);

        //7.
        System.out.println(eletkor + ", " + fullname + ", " + szulhely);

        //8.
        if (knev.startsWith("A")) System.out.println("A betűvel kezdődik");
        else System.out.println("Nem A betűvel kezdődik");

        //9.
        if (knev.endsWith("t")) System.out.println("t betűvel végződik");
        else System.out.println("Nem t betűvel végződik");

        //10.
        System.out.println(fullname.length());

        //11
        System.out.println(fullname.replace('i', 'y'));

    }
}

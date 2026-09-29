import java.util.Scanner;

public class IFfeladat3 {
    static void main(){
        System.out.println("Kérek 3 egész számot!");
        Scanner sc = new Scanner(System.in);
        int szam1 = sc.nextInt();
        int szam2 = sc.nextInt();
        int szam3 = sc.nextInt();

        if(szam1>szam2 && szam1> szam3) System.out.println("Az első szám a legnagyobb!");
        else if(szam2> szam1 && szam2> szam3) System.out.println("A második szám a legnagyobb!");
        else if(szam3> szam2 && szam3> szam1) System.out.println("A harmadik szám a legnagyobb!");

        if(szam1>szam2 && szam3> szam1) System.out.println("Az első szám a középső!");
        else if(szam2>szam1 && szam3> szam2) System.out.println("A második szám a középső!");
        else if(szam3>szam1 && szam2> szam3) System.out.println("A harmadik szám a középső!");

        if(szam1<szam2 && szam1< szam3) System.out.println("Az első szám a legkisebb!");
        else if(szam2< szam1 && szam2< szam3) System.out.println("A második szám a legkisebb!");
        else if(szam3< szam2 && szam3< szam1) System.out.println("A harmadik szám a legkisebb!");

    }
}

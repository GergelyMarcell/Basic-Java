import java.util.Scanner;

public class IFfeladat1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int szam1 = sc.nextInt();
        int szam2 = sc.nextInt();

        //1. - 2.
        if (szam1 != szam2){
            System.out.println( szam1 > szam2 ? "Első szám nagyobb! "+szam1+">"+szam2 : "Második szám nagyobb!"+szam1+"<"+szam2);
        }

        //3.
        System.out.println(szam1==szam2 ? "A két szám egyenlő!" : "A két szám nem egyenlő!");

    }
}

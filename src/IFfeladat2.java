import java.util.Scanner;

public class IFfeladat2 {
    static void main(){
        System.out.println("Adjon meg egy magasságot!");
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        if(szam < 149 || szam > 196) System.out.println("NO SIZE");
        else if(szam > 149 && szam < 166) System.out.println("S méret");
        else if(szam > 165 && szam < 176) System.out.println("M méret");
        else if(szam > 175 && szam < 185) System.out.println("L méret");
        else if(szam > 185 && szam < 196) System.out.println("XL méret");

    }
}

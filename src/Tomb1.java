import java.util.Scanner;

public class Tomb1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány adat legyen a tömbben?");
        int db = sc.nextInt();
        int[] t = new int[db];
        for (int i = 0; i < t.length; i++){
            System.out.println("Kérem a(z) "+ (i+1) +". számot: ");
            int szam = sc.nextInt();
            t[i] = szam;
        }
        for (int cucc : t){
            System.out.println(cucc);
        }
    }
}

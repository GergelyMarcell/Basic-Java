import java.util.Scanner;

public class Tomb2 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány adat legyen a tömbben: ");
        int db = sc.nextInt();
        double[] t = new double[db];
        for (int i = 0; i < t.length; i++){
            System.out.println("Kérem a(z) " + (i+1) + ". elemet: ");
            double szam = sc.nextDouble();
            t[i] = szam;
        }

        for(double szam : t){
            System.out.println(szam);
        }
    }
}

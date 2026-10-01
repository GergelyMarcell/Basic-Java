import java.util.Scanner;

public class Tomb3 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány elemű legyen a tömbb: ");
        int db = sc.nextInt();
        String[] t = new String[db];
        for(int i = 0; i < t.length; i++){
            System.out.println("Kérem a(z) " + (i+1) +". elemet: ");
            String cucc = sc.next();
            t[i] = cucc;
        }
        for(String cucc : t){
            System.out.println(cucc);
        }
    }
}

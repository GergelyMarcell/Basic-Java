import java.util.Scanner;

public class ParosParatlanWhile {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        while (szam > 0){
            if(szam % 2 == 0){
                System.out.println("Páros!");
            }
            else{
                System.out.println("Páratlan!");
            }
            szam = sc.nextInt();
        }
    }
}

import java.util.Scanner;

public class ParosParatlanDoWhile {
    public void main(){
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        do{
            if(szam % 2 == 0){
                System.out.println("Páros!");
            }else {
                System.out.println("Páratlan!");
            }
            szam = sc.nextInt();
        }while (szam>0);
    }
}

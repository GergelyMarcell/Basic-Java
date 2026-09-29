import java.util.Scanner;

public class Szogek {
    public void main (){
        Scanner sc = new Scanner(System.in);
        int szog = sc.nextInt();
        switch (szog){
            case 0:
                System.out.println("Null szög!"); break;
            case 90:
                System.out.println("Derékszög!"); break;
            case 180:
                System.out.println("Egyenes szög!"); break;
            case 360:
                System.out.println("Teljes szög!"); break;
        }
    }
}

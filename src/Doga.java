import java.util.Scanner;

public class Doga {
    static void main(){
        //1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy nevet: ");
        String nev = sc.nextLine();
        System.out.println("Kérek egy számot 1 és 10 között: ");
        int szam1 = sc.nextInt();
        while (szam1 >= 10 || szam1 <= 1){
            System.out.println("Kérek egy számot 1 és 10 között: ");
            szam1 = sc.nextInt();
        }
        System.out.println("Kérek egy számot 10 és 90 között: ");
        int szam2 = sc.nextInt();
        while (szam2 > 90 && szam2 < 10){
            System.out.println("Kérek egy számot 10 és 90 között: ");
            szam2 = sc.nextInt();
        }

        System.out.println("Hello " + nev + "!");

        //2.
        double korTer =Math.pow(szam1,2) * Math.PI;
        System.out.println("A kör területe: " + korTer + ", Egészre kerekítve: " + Math.round(korTer));

        //3.
        if(szam2 % 3 == 0 && szam2 % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(szam2 % 3 == 0 && szam2 % 5 != 0){
            System.out.println("Fizz");
        }
        else if(szam2 % 3 != 0 && szam2 % 5 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println("A szám: " + szam2);
        }

        //4.
        boolean prime = true;
        String osztok = "";
        for (int i = 2; i < szam1; i++){
            if(szam1 % i == 0){
                prime = false;
                osztok += i + ", ";
            }
        }
        if(prime){
            System.out.println("A szám prím!");
        }
        else {
            System.out.println("A szám nem prím, osztói: 1, " + osztok + "" + szam1);
        }
    }
}

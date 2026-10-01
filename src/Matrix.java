import java.util.Scanner;

public class Matrix {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány sora legyen a mátrixnak: ");
        int sor = sc.nextInt();
        System.out.println("Hány oszlopa legyen a mátrixnak: ");
        int oszlop = sc.nextInt();

        int[][] matrix = new int[sor][oszlop];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.println("Kérem a mátrix " + row + ". sor " + col + ". oszlopának értékét: ");
                matrix[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.println(matrix[row][col]);
            }
        }
    }
}

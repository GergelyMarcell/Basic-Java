import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        //Create a list ('List A') which contains the following values
        // Apple, Avocado, Blueberries, Durian, Lychee
        List<String> A = new ArrayList<>(List.of("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));

        //Create a new list ('List B') with the values of List A
        List<String> B = new ArrayList<>(A);

        //Print out whether List A contains "Durian" or not
        System.out.println(A.contains("Durian"));

        //Remove "Durian" from List B
        B.remove("Durian");

        //Add "Kiwifruit" to List A after the 4th element
        A.add(4,"Kiwifruit");

        //Compare the size of List A and List B


        //Get the index of "Avocado" from List A
        A.indexOf("Avocado");

        //Get the index of "Durian" from List B


        //Add "Passion Fruit" and "Pomelo" to List B in a single statement


        //Print out the 3rd element from List A


        //Print all elements of List A


        //Print all elements of List B


        // Output:
        //true
        //false
        //1
        //-1
        //Blueberries
        //[Apple, Avocado, Blueberries, Durian, Kiwifruit, Lychee]
        //[Apple, Avocado, Blueberries, Lychee, Passion Fruit, Pomelo]
    }
}

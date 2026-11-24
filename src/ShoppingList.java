import java.util.LinkedList;
import java.util.List;

public class ShoppingList {
    public static String van(LinkedList<String> bevasarlolista, String dolog){
        return bevasarlolista.contains(dolog) ? "yes":"no";
    }
    public static void main(String[] args){
        LinkedList<String> bevasarlolista = new LinkedList<>(List.of("eggs", "milk", "fish", "apple", "bread", "chicken"));
        System.out.println(van(bevasarlolista,"milk"));
        System.out.println(van(bevasarlolista,"bananas"));
    }
}

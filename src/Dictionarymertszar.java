import java.util.HashMap;
import java.util.Map;

public class Dictionarymertszar {
    public static void MapIntroduction1(){
        System.out.println("1.");
        Map<Integer,Character> dic1 = new HashMap<>();
        System.out.println(dic1.isEmpty());

        dic1.putAll(Map.of(97 , 'a', 98 , 'b', 99 , 'c', 65 , 'A', 66 , 'B', 67 , 'C'));
        System.out.println(dic1.keySet());
        System.out.println(dic1.values());

        dic1.put(68,'D');
        System.out.println(dic1.size());
        System.out.println(dic1.get(99));

        System.out.println(dic1.get(97));
        dic1.remove(97);

        System.out.println(dic1.containsKey(100));
        dic1.clear();
        System.out.println(dic1.size());
    }

    public static void MapIntroduction2(){
        System.out.println("2.");
        Map<String,String> dic2 = new HashMap<>(Map.of("978-1-60309-452-8" , "A Letter to Jo", "978-1-60309-459-7" , "Lupus", "978-1-60309-444-3" , "Red Panda and Moon Bear", "978-1-60309-461-0" , "The Lab"));
        for(Map.Entry e : dic2.entrySet()){
            System.out.println(e.getValue() + " (ISBN:" + e.getKey() + ")");
        }
        dic2.remove("978-1-60309-444-3");
        dic2.values().remove("The Lab");
        dic2.putAll(Map.of("978-1-60309-450-4", "They Called Us Enemy", "978-1-60309-453-5", "Why Did We Trust Him?"));
        System.out.println(dic2.containsKey("478-0-61159-424-8"));
        System.out.println(dic2.get("978-1-60309-453-5"));
    }
    public static void main(String[] args){
        MapIntroduction1();
        MapIntroduction2();
    }
}

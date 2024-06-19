import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Character,String> map = new HashMap<>();
        Map<Character,String> map1 = new LinkedHashMap<>();
        Map<Character,String> map2 = new TreeMap<>();
        map.put('k',"khoa");
        map.put('L',"Long");
        map.put('D',"Dung");

        for (Map.Entry<Character,String> pair : map.entrySet()){
            System.out.println("pair.getKey() = " + pair.getKey());
            System.out.println("pair.getValue() = " + pair.getValue());
        }

    }
}

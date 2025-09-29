package Sep_28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearningHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ayush");
        map.put(2, "Ayushi");
        map.put(3, "Ayusha");

        System.out.println(map);
        //To get a value by using key
        System.out.println(map.get(3));
        System.out.println();

        //To check if a map contains key?
        System.out.println(map.containsKey(2));
        System.out.println();

        //To check value
        System.out.println(map.containsValue("Ayusha"));
        System.out.println();

        //Run a loop
        Set<Integer> keys = map.keySet();
        for(int i : keys){
            System.out.println(map.get(i));
            //This may shows there is no order in Hashmap
        }
        System.out.println();

        //Another loop
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> i :entries){
            System.out.println(i.getKey()+" -> "+i.getValue());
        }
    }
}

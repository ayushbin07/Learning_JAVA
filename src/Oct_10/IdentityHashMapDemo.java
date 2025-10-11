package Oct_10;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        //In Identity HashMap
        String key1 =new String("key");
        System.out.println(System.identityHashCode(key1)); //Different, Based on memory address.
        System.out.println(key1.hashCode()); //Same , Based on content.
        String key2 = new String("key");
        System.out.println(System.identityHashCode(key2)); //Different
        System.out.println(key2.hashCode()); //Same
        //Since new keyword were used Hashcodes for each should be unique.
        //But in Identity HashMap the hashcode is generated using the object's content.
        //But since here HashCode is generated using Object's content since it is same.
        Map<String,Integer> map = new IdentityHashMap<>();
        //Hashcode and equals
        map.put(key1,1); // key, 1
        map.put(key2,2); //key, 2
        //equal method
        System.out.println(key1.equals(key2));
        //Hence
        System.out.println(map); // Hence returns {key=2}

        System.out.println("**************************");
        //If this were hash map
        Map<String,Integer> map1 = new HashMap<>();
        map1.put(key1,1); // key, 1
        map1.put(key2,2); //key, 2
        System.out.println(map1);
        System.out.println("**************************");
    }
}

package Oct_11;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>((a,b) -> b-a);
        //(a,b) -> b-a this changes the natural way of sorting from ascending to descending.
        sortedMap.put(99, "Ayu");
        sortedMap.put(100,"Hello");
        sortedMap.put(4, "Meow");
        sortedMap.put(19, "Apple");
        System.out.println(sortedMap);

        System.out.println("First Key: "+sortedMap.firstKey());
        System.out.println("last Key: "+sortedMap.lastKey());
        System.out.println(sortedMap.headMap(99)); //upto??
        System.out.println(sortedMap.tailMap(4)); //from??
        System.out.println(sortedMap.subMap(101,78)); //from where to where??

    }
}

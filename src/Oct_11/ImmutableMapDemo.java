package Oct_11;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map0 = new HashMap<>();
        map0.put("A",1);
        map0.put("B",2);
        map0.put("c",3);
        //One way to create Immutable map
        Map<String,Integer> map1= Collections.unmodifiableMap(map0);
        System.out.println(map1); //Creates a permanent view of map0

        //Better way
        Map<String ,Integer> map2 = Map.of("ABC",1,"DEF",2,"GHI",3); //Only Upto 10 Entries

        //More than 10 Entries
        Map<String,Integer> map3 = Map.ofEntries(Map.entry("ABCD",1),Map.entry("EFGH",2));

        System.out.println(map2 +"\n"+ map3);

    }
}


package Oct_08;

import Sep_28.LearningHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;
    public LRUCache(int capacity){
        super(capacity, 0.75f,true);
        this.capacity = capacity;
    }

//Say We want to automaticcally delete the extra added entry (more than 3);
//we can do that overridding Linked Hash Map method
@Override
protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size()>capacity;
}



    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Bob", 99);

        studentMap.put("Alice",89) ;studentMap.get("Bob");
        studentMap.put("Ram",50);
        studentMap.put("Bipul",45); studentMap.put("Bob",100);

        System.out.println(studentMap);
    }
}

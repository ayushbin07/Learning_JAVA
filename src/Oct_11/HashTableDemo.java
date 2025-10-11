package Oct_11;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        //Key Characteristic is it is synchronized.
        hashtable.put(1,"a");
        hashtable.put(2,"b");
        System.out.println(hashtable);
        System.out.println(hashtable.get(2));
        //All same as Hash Map

        //Showcasing Synchronization of HashTable
        //First HASHMAP
        HashMap<Integer, String> map = new HashMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i =0;i<1000;i++){
                map.put(i,"Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i=1000;i<2000;i++){
                map.put(i,"Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of Hashmap: "+ map.size()); //Output was 1990

        //Now HashTable
        Hashtable<Integer, String> map1 = new Hashtable<>();
        Thread thread3 = new Thread(() -> {
            for (int i =0;i<1000;i++){
                map1.put(i,"Thread1");
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i=1000;i<2000;i++){
                map1.put(i,"Thread2");
            }
        });
        thread3.start();
        thread4.start();
        try{
            thread3.join();
            thread4.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of Hashmap: "+ map1.size()); //Output was 2000

    }
}

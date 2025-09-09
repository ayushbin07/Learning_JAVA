package Frameworks;

import java.util.LinkedList;
import java.util.Vector;

public class VectorSep10 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,2);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector);
        System.out.println(vector.capacity());
        vector.add(6);
        System.out.println(vector.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println(vector1);
    }
}

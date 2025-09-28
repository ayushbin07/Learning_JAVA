package Sep_28;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class LearningVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(12);

        //To ccheck capacity
        System.out.println(vector.capacity());

        //To increment capacity
        //It is dynamic so It automatically by two times but we can control that.
        //Vector<Integer> vector = new Vector<>(12,3);
        //Here what happens is the size increments by 3 rather than doubling

        //We can also give array or linkedlsit as a colllection to Vector
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1); linkedList.add(1); linkedList.add(1); linkedList.add(1);
        Vector<Integer> vector1 = new Vector<>(linkedList);
        //or
        Vector<Integer> vector2 = new Vector<>(Arrays.asList(1, 2, 3, 4));
        //or make an array
        System.out.println(vector1);
        System.out.println(vector2);
    }
}
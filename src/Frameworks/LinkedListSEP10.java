package Frameworks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListSEP10 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addLast(9);
        linkedList.addFirst(0);
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
        linkedList.remove(3);
        linkedList.removeIf(x -> x %2 ==0);
        System.out.println(linkedList);

        java.util.LinkedList<String> animals = new java.util.LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
        animals.removeAll(animalToRemove);
        System.out.println(animals);
        ArrayList<Integer> arrayList = new ArrayList<>();
    }
}

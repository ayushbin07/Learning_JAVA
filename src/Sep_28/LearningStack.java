package Sep_28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class LearningStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Integer removedElements = stack.pop(); //returns 5 and removes it
        Integer peekElement = stack.peek(); //returns 4 but doesnt remove it
        System.out.println(removedElements +","+ peekElement);
        System.out.println(stack);
        System.out.println(stack.isEmpty());//checks if it is empty?
        System.out.println(stack.size());

        //vectors use
        stack.add(2);
        System.out.println(stack);
        stack.remove(2);
        System.out.println(stack);

        //Use search
        System.out.println(stack.search(4)); //shows the index


        //Using linkedList as a Stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.getLast();          //peek
        linkedList.removeLast();         //pop
        linkedList.size();
        linkedList.isEmpty();

        //Using ArrayList as a Stack
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size()-1); //peek
        arrayList.remove(arrayList.size()-1); //pop


    }
}

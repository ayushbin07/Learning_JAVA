package Oct_04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        //Not queue but LinkedList can act as a Queue
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);  //enqueue
        list.addLast(2);  //enqueue
        list.addLast(3);  //enqueue
        System.out.println(list);
        Integer i = list.removeFirst();  //dequeue //pop
        System.out.println(list);
        list.getFirst(); // peek
        list.peek(); //also peek

        //But It takes too much Time Complexitity.
        //so java added
        System.out.println("######################");

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println(queue.size());
        System.out.println(queue.remove()); //throws exception if empty.
        System.out.println(queue.poll()); //better than before

        //System.out.println(queue.element()); //throws exception if empty
        System.out.println(queue.peek()); //doesnt

        //To make fixed size queue
        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        queue1.add(1); //returns true
        queue1.offer(2); //returns false

        System.out.println(queue1.offer(3)); //-> returns false, but if .add was used it would throw exeception.




    }
}

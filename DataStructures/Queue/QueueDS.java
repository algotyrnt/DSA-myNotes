package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //System.out.println(queue.isEmpty());
        //System.out.println(queue.size());
        //System.out.println(queue.contains("Harold"));

        //System.out.println(queue.peek());
        //queue.poll();
        //queue.poll();
        //queue.poll();
        //queue.poll();

        System.out.println(queue);

    }
}

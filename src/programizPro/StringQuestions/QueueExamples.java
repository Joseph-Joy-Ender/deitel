package programizPro.StringQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        // Queue = FIFO DATA STRUCTURE, first-in-first-out
        // a collection designed for holding elements prior to processing
        Queue<String> queue = new LinkedList<>();
        queue.offer("Joy");
        queue.offer("Joseph");
        queue.offer("Ender");
        queue.offer("Udeme");

        queue.poll();
        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.contains("Ender"));




    }
}

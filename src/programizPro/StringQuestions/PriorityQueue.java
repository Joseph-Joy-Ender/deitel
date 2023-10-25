package programizPro.StringQuestions;
import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        Queue<String> queue = new java.util.PriorityQueue<>(Collections.reverseOrder());
        // Priority Queue = A FIFO DATA STRUCTURE THAT SERVES ELEMENTS
        // WITH THE HIGHEST PRIORITIES FIRST BEFORE ELEMENTS WITH
        // LOWER PRIORITY

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}

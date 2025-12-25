import java.util.*;

class MyQueue {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int order = 0;

    // FIFO বজায় রাখার জন্য
    public void enqueue(int x) {
        pq.add(order++ * 1000 + x);
    }

    public int dequeue() {
        return pq.poll() % 1000;
    }
}

class MyStack {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int order = 0;

    // LIFO বজায় রাখার জন্য
    public void push(int x) {
        pq.add(order++ * 1000 + x);
    }

    public int pop() {
        return pq.poll() % 1000;
    }
}

public class QueueStackUsingPQ {

    public static void main(String[] args) {

        MyQueue q = new MyQueue();
        q.enqueue(10); q.enqueue(20); q.enqueue(30);
        System.out.println("Queue Dequeue: " + q.dequeue());

        MyStack s = new MyStack();
        s.push(5); s.push(15); s.push(25);
        System.out.println("Stack Pop: " + s.pop());
    }
}

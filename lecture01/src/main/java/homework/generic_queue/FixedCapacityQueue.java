package homework.generic_queue;

public class FixedCapacityQueue <T> implements Queue<T>{
    private Node first, last;
    private int top = 0;
    private int capacity;

    public FixedCapacityQueue(int capacity)
    {
       this.capacity = capacity;
    }

    private class Node
    {
        T item;
        Node next;
    }

    public void enqueue(T item) {
        if (this.size() > capacity) System.out.println("Стек переполнен!");
        else {
            Node oldlast = last;
            last = new Node();
            last.item = item;
            last.next = null;
            if (isEmpty()) first = last;
            else oldlast.next = last;
            top++;
            System.out.println(item);
        }
    }

    public T dequeue() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        top--;
        return item;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public static void main(String[] args) {
        FixedCapacityQueue<String> q = new FixedCapacityQueue<String>(5);
        q.enqueue("Hello");
        q.enqueue("World");
        q.enqueue("!");
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.size());
    }
}

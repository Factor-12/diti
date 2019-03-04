package homework.queue;

public class LinkedQueueOfStrings implements Queue{
    private Node first, last;
    private int top = 0;

    private class Node
    {
        String item;
        Node next;
    }
    public void enqueue(String item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        top++;
        System.out.println(item);
    }

    public String dequeue() {
        String item = first.item;
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
        LinkedQueueOfStrings q = new LinkedQueueOfStrings();
        q.enqueue("Hello");
        q.enqueue("World");
        q.enqueue("!");
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}

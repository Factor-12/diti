package homework.queue;

public class FixedCapacityQueueOfStrings implements Queue{
    private String[] q;
    private int top = 0;
    private int first = 0;
    private int last = 0;

    public FixedCapacityQueueOfStrings(int capacity)
    {
        q = new String[capacity];
    }
    public void enqueue(String item) {
        q[last++] = item;
        if (last == q.length) last = 0;
        top++;
        System.out.println(item);
    }

    public String dequeue() {
        String item = q[first];
        q[first] = null;
        top--;
        first++;
        return item;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public static void main(String[] args) {
        FixedCapacityQueueOfStrings q = new FixedCapacityQueueOfStrings(5);
        q.enqueue("Hello");
        q.enqueue("World");
        q.enqueue("!");
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
}

package homework.queue;

public class ResizingArrayQueueOfStrings implements Queue{
    private String[] q;
    private int top = 0;
    private int first = 0;
    private int last = 0;
    private ResizingArrayQueueOfStrings ()
    {
        q = new String[1];
    }
    private void resize(int capacity)
    {
        String[] q2 = new String[capacity];
        for (int i = 0; i < top; i++) {
            q2[i] = q[(first + i) % q.length];
        }
        q = q2;
        first = 0;
        last = top;
    }
    public void enqueue(String item) {
        if (top == q.length) resize(2 * q.length);
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
        if (first == q.length) first = 0;
        if (top > 0 && top == q.length/4) resize(q.length/2);
        return item;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public static void main(String[] args) {
        ResizingArrayQueueOfStrings q = new ResizingArrayQueueOfStrings();
        q.enqueue("Hello");
        q.enqueue("World");
        q.enqueue("!");
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.size());
    }
}

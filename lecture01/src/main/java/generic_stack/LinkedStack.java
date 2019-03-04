package generic_stack;

public class LinkedStack <T> implements generic_stack.Stack<T> {
    private Node first = null;
    private int top = 0;

    private class Node
    {
        T item;
        Node next;
    }
    public void push(T item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        top++;
    }

    public T pop() {
        T item = first.item;
        first = first.next;
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
        LinkedStack<String> s = new LinkedStack<String>();
        s.push("Hello");
        s.push("World");
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());

    }
}

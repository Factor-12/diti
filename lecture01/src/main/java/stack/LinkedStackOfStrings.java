package stack;

public class LinkedStackOfStrings implements Stack{
    private Node first = null;
    private int top = 0;

    private static class Node{
        String item;
        Node next;
    }
    public void push(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        top++;
    }

    public String pop() {
            String item = first.item;
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
        LinkedStackOfStrings s = new LinkedStackOfStrings();
        s.push("Hello");
        s.push("World");
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}

package homework.iterator;

import generic_stack.Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableStack<T> implements Stack<T>, Iterable<T>{
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

    public Iterator<T> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<T>
    {
        private Node current = first;
        public boolean hasNext() {
            return current!=null;
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        IterableStack<String> stack = new IterableStack<String>();
        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        for (String s:stack) {
            System.out.println(s);
        }
        System.out.println(stack.size());
    }
}

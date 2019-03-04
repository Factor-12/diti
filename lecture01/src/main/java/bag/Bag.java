package bag;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bag<Item> implements Iterable<Item> {
    private Node<Item> first;
    private int n;

    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public Bag() {
        first = null;
        n = 0;
    }

    public void add(Item x) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = x;
        first.next = oldfirst;
        n++;
    }

    public int size() {
        return n;
    }

    public Iterator<Item> iterator() { return new ListIterator(); }

    private class ListIterator implements Iterator<Item> {
        private Node<Item> current = first;

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        Scanner scan = new Scanner(System.in);
        bag.add("Hello");
        bag.add("World");
        bag.add("!");
        System.out.println(bag.size());
        for (String s : bag) {
            System.out.println(s);
        }
    }
}

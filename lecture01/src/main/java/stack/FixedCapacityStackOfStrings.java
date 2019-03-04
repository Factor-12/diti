package stack;

public class FixedCapacityStackOfStrings implements Stack{
    private String[] items;
    private int top;
    public FixedCapacityStackOfStrings(int capacity)
    {
        items = new String[capacity];
    }
    public void push(String item) {
        if (isFull())
        {
            System.out.println("Стек полный!");
        }
        else { items[top++] = item; }
    }

    public String pop() {
        if (isEmpty())
        {
            System.out.println("Стек пустой!");
        }
        return items[--top];
    }
    public boolean isFull()
    {
        return (top == items.length);
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public int size() {
        return top;
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(4);
        s.push("Hello");
        s.push("World");
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}

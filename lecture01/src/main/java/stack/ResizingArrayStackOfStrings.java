package stack;

public class ResizingArrayStackOfStrings implements Stack{
    private String[] s;
    private int top = 0;
    public ResizingArrayStackOfStrings()
    {
        s = new String[1];
    }
    private void resize(int capacity)
    {
        String[] s2 = new String[capacity];
        for (int i = 0; i < top; i++) {
            s2[i] = s[i];
        }
        s = s2;
    }
    public void push(String item) {
        if(top == s.length) resize(2 * s.length);
        s[top++] = item;
    }

    public String pop() {
        String item = s[--top];
        s[top] = null;
        if (top > 0 && top == s.length/4) resize(s.length/2);
        return item;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public static void main(String[] args) {
        ResizingArrayStackOfStrings s = new ResizingArrayStackOfStrings();
        s.push("Hello");
        s.push("World");
        s.push("!");
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}

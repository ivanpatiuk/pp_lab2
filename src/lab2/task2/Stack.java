package lab2.task2;

public class Stack <T>{
    private Node top;
    private int size = 0;

    public Stack() {}

    public void push(T element) {
        Node node = new Node(element);
        node.next = this.top;
        this.top = node;
        ++size;
    }
    public T getTopValue(){ return size==0 ? null : (T)top.value; }
    public T pop() {
        T tmp = (T)top.value;
        top = top.next;
        --size;
        return tmp;
    }
    public boolean isEmpty() { return size == 0; }
    public void clear(){ while(size>0) pop(); }
}

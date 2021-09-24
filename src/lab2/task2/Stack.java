package lab2.task2;

public class Stack <T>{
    private Node top = null;
    private int size = 0;

    public Stack() {}

    public void push(T element) {
        Node node = new Node(element);
        node.setNext(this.top);
        this.top = node;
        ++size;
    }
    public T getTopValue(){ return size==0 ? null : (T)top.getValue(); }
    public T pop() {
        T tmp = (T)top.getValue();
        top = top.getNext();
        --size;
        return tmp;
    }
    public boolean isEmpty() { return size == 0; }
    public void clear(){ while(size>0) pop(); }
}

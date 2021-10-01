package lab2.task2;

import java.util.Iterator;

public class Stack <T> implements Iterable<T>{
    private Node top = null;
    private int size = 0;

    public Stack() {}
    public Stack(Stack<T> stack){
        this.top = stack.top;
        this.size = stack.size;
    }

    public void push(T element) {
        if(element != null) {
            Node node = new Node(element);
            node.setNext(this.top);
            this.top = node;
            ++size;
        }
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
    public int getSize() { return size; }
    public Node getTop() { return top; }

    public Iterator<T> iterator() {
        return new StackIterator<T>(this);
    }

    class StackIterator<T> implements Iterator<T> {
        Node<T> current;

        public StackIterator(Stack<T> stack) { current = stack.getTop(); }
        public boolean hasNext() { return current != null; }
        public T next() {
            T data = current.getValue();
            current = current.getNext();
            return data;
        }
        public void remove() { throw new UnsupportedOperationException(); }
    }

}

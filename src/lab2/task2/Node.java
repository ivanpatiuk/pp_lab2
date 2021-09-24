package lab2.task2;

public class Node <T>{
    private T value = null;
    private Node next = null;

    public Node() {}
    public Node(T value) { this.value=value;}

    public void setValue(T value) { this.value=value;}
    public T getValue() { return value;}

    public void setNext(Node next) { this.next=next;}
    public Node getNext() { return next;}
}

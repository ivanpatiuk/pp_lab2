package lab2.task2;

public class Task2 {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(5);
        myStack.push(3);
        myStack.push(13);
        myStack.push(7);
        myStack.clear();
        myStack.push(5);
        myStack.push(3);
        myStack.push(13);
        myStack.push(7);
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}

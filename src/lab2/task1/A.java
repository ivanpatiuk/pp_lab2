package lab2.task1;

public class A {
    protected String str;

    static {
        System.out.println("A initialization");
    }

    public A(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}

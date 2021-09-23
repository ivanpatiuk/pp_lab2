package lab2.task1;

public class B extends A{
    protected int value;

    static{ System.out.println("A initialization"); }

    public B(String str, int value) {
        super(str);
        this.value = value;
    }
    @Override
    public String toString(){
        return str+" "+value;
    }
}

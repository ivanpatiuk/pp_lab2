package lab2.task1;

public class C extends B{
    private boolean bool;

    static{ System.out.println("C initialization"); }

    public C(String str, int value, boolean bool) {
        super(str, value);
        this.bool = bool;
    }
    @Override
    public String toString(){
        return str+" "+value+" "+bool;
    }
}

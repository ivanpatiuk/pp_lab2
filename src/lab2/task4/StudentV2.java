package lab2.task4;

import lab2.task3.*;

public class StudentV2 extends Student {
    private final int ID;
    static int created = 0;

    public StudentV2(){ super(); ++created; ID = created;}
    public StudentV2(final String name, final String surname){
        super(name,surname);
        ++created;
        ID = created;
    }
    public StudentV2(final String name, final String surname,final Subjects subjects){
        super(name,surname,subjects);
        ++created;
        ID=created;
    }

    public int getID() { return ID; }
    @Override
    public String toString(){ return ID +" "+ name + " " + surname + " " + subjects.toString(); }
}

package lab2.task3;

import java.util.*;

public class Subject {
    private Map<SubjectList, Mark> subjects = new HashMap<>();
    private SubjectsList subject;
    private int tmpmark;

    public Subject(){};
    public Subject(SubjectsList subject){
        this.subject=subject;
    }
    public SubjectsList getSubject() { return subject; }
    public void setSubject(SubjectsList subject) { this.subject = subject; }
    @Override
    public boolean equals(Object obj){
        if (obj==null) return false;
        if (obj.getClass()!=this.getClass()) return false;
        Subject tmp = (Subject)obj;
        return this.getSubject().equals(tmp.getSubject());
    }
    @Override
    public int hashCode(){ return 1000*subject.hashCode()+27; }
}

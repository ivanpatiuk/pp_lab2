package lab2.task3;

public class Student {
    private Subjects subjects = new Subjects();
    private String name;
    private String surname;

    public Student(){}
    public Student(final String name, final String surname){this.name=name;this.surname=surname;}
    public Student(final String name, final String surname,final Subjects subjects){
        this.name = name;
        this.surname = surname;
        this.subjects = subjects;
    }
    public void addSubject(final SubjectsList subject, final Mark mark){ subjects.addSubject(subject, mark);}
    public void removeSubject(final SubjectsList subject){ subjects.removeSubject(subject);}
    public void changeMark(final SubjectsList subject, final Mark mark){ subjects.changeMark(subject, mark); }
    public void setSubjects(final Subjects subjects) { this.subjects = subjects;}
    public Subjects getSubjects() { return subjects; }

    @Override
    public String toString(){ return name+" "+surname+": " +subjects.toString(); }
}

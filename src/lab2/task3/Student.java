package lab2.task3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private String surname;
    private Map<Subject, Mark> subjects = new HashMap<>();

    public Student(){};
    public Student(String name, String surname){this.name=name;this.surname=surname;}
    public Student(String name, String surname,Map<Subject, Mark> subjects){
        this.name = name;
        this.surname = surname;
        this.subjects = subjects;
    };
    public void addSubject(Subject subject, Mark mark){ subjects.putIfAbsent(subject, mark); }
    public void removeSubject(Subject subject){ subjects.remove(subject);}
    public void changeMark(Subject subject, Mark mark){
        subjects.replace(subject, this.subjects.get(subject),mark);
    }
    public void setSubjects(Map<Subject, Mark> map) { subjects = map;}
    public Map<Subject, Mark> getSubjects() { return subjects; }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(name+" "+surname+": ");
        for(Map.Entry<Subject,Mark> item : subjects.entrySet()){
            str.append(item.getKey().getSubject()+" "+item.getValue().getMark()+", ");
        }
        str.delete(str.length()-2, str.length());
        return str.toString();
    }
}

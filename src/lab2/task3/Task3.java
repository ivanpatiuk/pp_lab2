package lab2.task3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Pupkin");
        s1.addSubject(new Subject(SubjectsList.Англійська), new Mark(5));
        s1.addSubject(new Subject(SubjectsList.Англійська), new Mark(5)); // значення не повинно записатися
        s1.addSubject(new Subject(SubjectsList.Фізика), new Mark(3));
        s1.addSubject(new Subject(SubjectsList.Фізкультура), new Mark(4));
        System.out.println(s1.toString());
        s1.changeMark(new Subject(SubjectsList.Англійська), new Mark(2));
        Set<Student> a = new HashSet<>();
    }
}

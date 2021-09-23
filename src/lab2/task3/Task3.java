package lab2.task3;

public class Task3 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Pupkin");
        s1.addSubject(SubjectsList.Англійська, new Mark(5));
        s1.addSubject(SubjectsList.Фізкультура, new Mark(3));
        s1.addSubject(SubjectsList.Англійська, new Mark(5));
        s1.addSubject(SubjectsList.Математика, new Mark(4));
        System.out.println(s1.toString());
        s1.changeMark(SubjectsList.Англійська, new Mark(2));
        s1.removeSubject(SubjectsList.Англійська);
        System.out.println(s1.toString());
    }
}

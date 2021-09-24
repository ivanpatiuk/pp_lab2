package lab2.task3;

public class Task3 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Pupkin");
        Student s2 = new Student();
        s2.setName("Oleh");
        s2.setSurname("Danylo");

        s2.getSubjects().addSubject(Subject.Українська, new Mark(2));
        s2.getSubjects().addSubject(Subject.Фізкультура, new Mark(3));
        s1.getSubjects().addSubject(Subject.Англійська, new Mark(5));
        s1.getSubjects().addSubject(Subject.Фізкультура, new Mark(3));
        s1.getSubjects().addSubject(Subject.Англійська, new Mark(5));

        s1.getSubjects().addSubject(Subject.Математика, new Mark(4));
        System.out.println(s1.toString());

        s1.getSubjects().changeMark(Subject.Англійська, new Mark(2));
        s1.getSubjects().removeSubject(Subject.Англійська);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        s1.getSubjects().addSubject(Subject.Математика, new Mark(3));
    }
}

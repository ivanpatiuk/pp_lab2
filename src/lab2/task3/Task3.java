package lab2.task3;

public class Task3 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Pupkin");
        Student s2 = new Student();
        s2.setName("Oleh");
        s2.setSurname("Danylo");

        s2.addSubject(SubjectsList.Українська, new Mark(2));
        s2.addSubject(SubjectsList.Фізкультура, new Mark(3));
        s1.addSubject(SubjectsList.Англійська, new Mark(5));
        s1.addSubject(SubjectsList.Фізкультура, new Mark(3));
        s1.addSubject(SubjectsList.Англійська, new Mark(5));

        s1.addSubject(SubjectsList.Математика, new Mark(4));
        System.out.println(s1.toString());

        s1.changeMark(SubjectsList.Англійська, new Mark(2));
        s1.removeSubject(SubjectsList.Англійська);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}

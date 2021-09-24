package lab2.task4;

import lab2.task3.*;
import java.util.*;

public class Task4 {
    public static void addSubjectToAll(List<StudentV2> studentsList, final Subject subject, final Mark mark){
        for(StudentV2 i: studentsList){
            i.getSubjects().addSubject(subject, mark);
        }
    }
    public static void printAllStudents(final List<StudentV2> studentsList){
        for(StudentV2 i : studentsList){
            System.out.println(i.toString());
        }
    }
    public static void printTheBestStudent(final List<StudentV2> studentsList){
        if (studentsList == null)
            return;
        double theBestAvg = 0;
        StudentV2 student = null;
        for(StudentV2 i : studentsList){
            double tmp=0;
            int subjectCounter = 0;
            for(Map.Entry<Subject, Mark> subject : i.getSubjects().getSubject().entrySet()){
                tmp+=subject.getValue().getMark();
                ++subjectCounter;
            }
            tmp=tmp/subjectCounter;
            if(theBestAvg<tmp) {
                theBestAvg = tmp;
                student=i;
            }
        }
        System.out.println("The best student: "+student.toString());
    }

    public static void main(String[] args) {
        List<StudentV2> list = new ArrayList<>();
        StudentV2 s1 = new StudentV2("Ivan", "Nepupkin");
        StudentV2 s2 = new StudentV2("Ivan","Pupkin");
        StudentV2 s3 = new StudentV2("Bohdan","Lazarenko");
        StudentV2 s4 = new StudentV2("Igor","Nobelev");

        s1.getSubjects().addSubject(Subject.Українська,new Mark(1));
        s2.getSubjects().addSubject(Subject.Програмування, new Mark(4));
        s3.getSubjects().addSubject(Subject.Фізкультура, new Mark(5));
        s4.getSubjects().addSubject(Subject.Фізкультура, new Mark(5));

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        addSubjectToAll(list, Subject.Англійська, new Mark(3));
        printAllStudents(list);
        printTheBestStudent(list);
        System.out.println();

        List<StudentV2> list1 = new ArrayList<>();
        list1.add(new StudentV2("Stepan","Lazarenko"));
        list1.add(new StudentV2("Yuriy","Boichuk"));
        list1.add(new StudentV2("Oleh","Mordenko"));

        addSubjectToAll(list1, Subject.Англійська, new Mark(3));
        addSubjectToAll(list1, Subject.Математика, new Mark(3));
        addSubjectToAll(list1, Subject.Фізика, new Mark(3));
        printAllStudents(list1);

        Map<Integer, Subjects> map = new HashMap<>();
        map.put(s1.getID(),s1.getSubjects());
        map.put(s2.getID(),s2.getSubjects());
        System.out.println();
        System.out.println(map.toString());
    }
}

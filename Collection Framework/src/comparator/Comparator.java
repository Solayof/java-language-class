package comparator;
import java.util.*;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class NameComparator extends Comparator implements java.util.Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class AgeComparator extends Comparator implements java.util.Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 15));
        students.add(new Student("Jane", 23));
        students.add(new Student("Jack", 32));
        students.add(new Student("Jill", 10));
        students.add(new Student("Janet", 16));

        System.out.println("Sorting by name");
        
        students.sort(new AgeComparator());

        for (Student s: students) {
            System.out.println(s.age);
        }
    }
}

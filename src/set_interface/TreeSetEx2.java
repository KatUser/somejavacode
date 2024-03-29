package set_interface;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> studentSet = new TreeSet<>();
        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);
        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);
        Student st6 = new Student("Oleg", 2);
        System.out.println(studentSet);
        System.out.println(studentSet.first());
        System.out.println(studentSet.last());
        System.out.println(studentSet.headSet(st6)); /* не вкл курс из st6 */
        System.out.println(studentSet.tailSet(st6)); /* вкл курс из st6 */
        Student st7 = new Student("Ivan", 4);
        System.out.println(studentSet.subSet(st6, st7));
        System.out.println(st3.equals(st6));
    }
}

class Student implements Comparable <Student> {
    String name;
    int course;


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}

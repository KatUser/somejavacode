package collectionsjava;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3); /*head*/
        Student2 st2 = new Student2("Ivan", 2);
        Student2 st3 = new Student2("Elena", 1 );
        Student2 st4 = new Student2("Petr", 5);
        Student2 st5 = new Student2("Maria", 4); /*tail*/
        LinkedList<Student2> student2LinkedList = new LinkedList<>(); /*double linkedlist */
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println(student2LinkedList); /*Порядок сохраняется*/
        System.out.println(student2LinkedList.get(2));

        Student2 st6 = new Student2("Zaur", 5);
        Student2 st7 = new Student2("Igor", 4);
        student2LinkedList.add(st6);
        System.out.println(student2LinkedList);
        student2LinkedList.add(1, st7);
        System.out.println(student2LinkedList);
        student2LinkedList.remove(3);
        System.out.println(student2LinkedList);
    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", course=" + course +
                ']';
    }
}
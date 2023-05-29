package cft.homework4;

import java.util.*;

public class Student {
   // public static List<Student> allStudents = new ArrayList<>();

    public static Map <String, List<String>> studentCourseMap = new LinkedHashMap<>();

    private int studentId;

    private String name;

    public Student(int studentId ,String name) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public static void getStudentInfo(String name) {
        if (studentCourseMap.containsKey(name)) {
            System.out.println("Студент " + name + " посещает курсы : " + studentCourseMap.get(name));
        } else {
            System.out.println("Студента с именем " + name + " нет");
        }
    }

    public static void addCourseToStudent(Student student, Course course) {
         if (!studentCourseMap.containsKey(student.getName())) {
             List<String> arrList = new ArrayList<>();
             arrList.add(course.getName());
             studentCourseMap.put(student.getName(), arrList);
         } else {
             if (studentCourseMap.get(student.getName()).contains(course.getName())) {
                 System.out.println("Студент уже проходит курс " + course.getName());
             } else {
                 studentCourseMap.get(student.getName()).add(course.getName());
             }
         }
    }
}

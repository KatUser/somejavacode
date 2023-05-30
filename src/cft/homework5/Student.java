package cft.homework5;

import java.util.*;

public class Student {
    public static List<Student> allStudents = new ArrayList<>();

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

    /**
     *
     * @param lastStudentName
     * @param firstInstructorName
     * получаем инфу о студенте и преподе
     */
    public static void getStudentInfo(String lastStudentName, String firstInstructorName) {
        for (Student student : Student.allStudents) {
            if (student.getName().split(" ")[1].equals(lastStudentName)) {
                for (Instructor instructor : Instructor.instructors) {
                    if (instructor.getName().split(" ")[0].equals(firstInstructorName)) {
                        System.out.println("Студент по фамилии " + lastStudentName + " есть");
                        System.out.println("Преподавать по имении " + firstInstructorName + " есть");
                    }
                }

            } else {
                System.out.println("Такой студент не числится у нас");
            }
        }
    }

    /**
     *
     * @param student
     * @param course
     * Добавляем студенту курсы
     */
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
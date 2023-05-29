package cft.homework4;

public class Homework {
    public static void main(String[] args) {
        Student student = new Student(1,"Vasya");
        Student student1 = new Student(2, "Inna");
        Student student2 = new Student(3, "Ola");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("English");
        Student.addCourseToStudent(student1, course1);
        Student.addCourseToStudent(student1, course2);
        Student.addCourseToStudent(student1, course1);
        System.out.println(Student.studentCourseMap);

        Student.getStudentInfo("Inna");
        Student.getStudentInfo("Lera");
        System.out.println(student2.getStudentId());

        Instructor instructor1 = new Instructor("Петров");
        Instructor.addDepToInstructor(instructor1, );

        }


    }
}

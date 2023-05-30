package cft.homework5;

/**
 * Имя препода + фамилия студента -> вся инфа о студенте, что знает университет
 */

public class Homework {
    public static void main(String[] args) {
        //Student student = new Student(1, "Ivan Petrow");
        //   University.addStudent(student);
        //   Student.getStudentInfo("Petrow", "Ivanov");

        Instructor instructor1 = new Instructor("Petr Pertov");
        Department.addInstructor(instructor1);

        Department department1 = new Department("Math");
        Instructor.addDepToInstructor(instructor1, department1);
        Instructor.getInstructorInfo("Petr");
    }
}
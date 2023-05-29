package cft.homework4;

import java.util.*;


public class Department {
    public static Map <Department, List<Instructor>> departmentsAndInstructors = new LinkedHashMap<>();
    private String name;
    public Department(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void  addInstructorToDepartment(Department department, Instructor instructor) {
        Instructor.instructors.add(instructor);
    };

    public void removeInstructor(Instructor instructor) {
        Instructor.instructors.remove(instructor);
    };

    public void getAllInstuctors() {
        for (Instructor instructor : Instructor.instructors) {
            System.out.println(instructor.getName());
        }
    };
}

package cft.homework4;

import java.util.*;

public class Instructor {

    public static List<Instructor> instructors = new LinkedList<>();
    public static Map<String, List<String>> instructorsDepMap = new LinkedHashMap<>();

    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInstructorInfo(Instructor instructor) {

        return null;
    }

    public static void addDepToInstructor(Instructor instructor, Department department) {
        if (!instructorsDepMap.containsKey(instructor.getName())) {
            List<String> arrList = new ArrayList<>();
            arrList.add(department.getName());
            instructorsDepMap.put(instructor.getName(), arrList);
        } else {
            if (instructorsDepMap.get(instructor.getName()).contains(department.getName())) {
                System.out.println("Студент уже числится на факультете " + department.getName());
            } else {
                instructorsDepMap.get(instructor.getName()).add(department.getName());
            }
        }
    }
}

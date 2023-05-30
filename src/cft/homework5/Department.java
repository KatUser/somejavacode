package cft.homework5;

import java.util.*;

public class Department {

    /**
     * Список факультетов
     */
    public static Set<Department> departments = new HashSet<>();

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @param instructor
     * Добавляем препода в список преподов
     */
    public static void  addInstructor(Instructor instructor) {
        Instructor.instructors.add(instructor);
    };

    /**
     *
     * @param instructor
     * Удаляем препода из списка преподов
     */
    public static void removeInstructor(Instructor instructor) {
        Instructor.instructors.remove(instructor);
    };

    /**
     * Получаем список всех преподов
     */
    public static void getAllInstuctors() {
        for (Instructor instructor : Instructor.instructors) {
            System.out.println(instructor.getName());
        }
    };
}

package cft.homework5;

import java.util.*;

public class Instructor {

    /**
     * Список преподов
     */
    public static List<Instructor> instructors = new LinkedList<>();

    /**
     * Список - препод + список его факультеты, где оно числится
     */
    public static Map<String, Set<String>> instructorsToDepMap = new LinkedHashMap<>();

    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 1. Достаём department препода
     * @param name инструктора
     */
    public static void getInstructorInfo(String name) {
        for(Map.Entry<String, Set<String>> entry : instructorsToDepMap.entrySet()) {
            if (entry.getKey().split(" ")[0].equals(name)) {
                if (entry.getValue().size() == 1) {
                    System.out.println("Преподаватель " + name + " преподаёт на факультете " + entry.getValue());
                } else {
                    System.out.println("Преподаватель " + name + " преподаёт на факультетах " + entry.getValue());
                }
            } else {
                System.out.println("Такой препродаватель не числится в университете");
            }
        }
    }

    /**
     *
     * @param instructor
     * @param department
     * Добавляем преподу факультеты
     */
    public static void addDepToInstructor(Instructor instructor, Department department) {
        if (!instructorsToDepMap.containsKey(instructor.getName())) {
            Set<String> depList = new HashSet<>();
            depList.add(department.getName());
            instructorsToDepMap.put(instructor.getName(), depList);
        } else {
            if (instructorsToDepMap.get(instructor.getName()).contains(department.getName())) {
                System.out.println("Препод уже числится на факультете " + department.getName());
            } else {
                instructorsToDepMap.get(instructor.getName()).add(department.getName());
            }
        }
    }
}

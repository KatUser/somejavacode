package cft.homework5;


import java.util.HashMap;
import java.util.Map;

public class Course {

    /**
     * Список курсов, где Integer = id курса, String = название курса;
     */
    private static Map<Integer, String> courses = new HashMap<>();

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

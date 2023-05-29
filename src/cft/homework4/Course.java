package cft.homework4;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private static Map<Integer, String> courses = new HashMap<>();

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

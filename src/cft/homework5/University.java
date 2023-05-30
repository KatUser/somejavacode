package cft.homework5;

import java.util.*;

public class University {
    private String name;
    private String address;
    private long phone;

    public University(String name, String address, long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     *
     * @param student
     * Добавляем студента в список студентов allStudents
     */
    public static void addStudent(Student student) {
        Student.allStudents.add(student);
    };

    /**
     *
     * @param student
     * Удаляем студента из списка студентов allStudents
     */
    public void removeStudent(Student student) {
        Student.allStudents.remove(student);
    };

    /**
     *
     * @return
     * Выводим список всех студентов
     */
    public List<Student> getAllStudents() {
        return Student.allStudents;
    }

    /**
     *
     * @param department
     * Добавляем фак-т в список фак-тов departments
     */
    public void addDepartment(Department department) {
        Department.departments.add(department);
    }

    /**
     *
     * @param department
     * Удаляем фак-т из списка фак-тов departments
     */
    public void removeDepartment(Department department) {
        Department.departments.remove(department);
    }

    /**
     * Получаем список всех факультетов departments
     */
    public void getAllDepartments() {
        for (Department dep : Department.departments) {
            System.out.println(dep.getName());
        }
    }
}

package cft.homework4;

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

    public void addStudent(Student student) {
        Student.allStudents.add(student);
    };

    public void removeStudent(Student student) {
        Student.allStudents.remove(student);
    };

    public List<Student> getAllStudents() {
        return Student.allStudents;
    }

    public void addDepartment(Department department) {
        Department.departments.add(department);
    }

    public void removeDepartment(Department department) {
        Department.departments.remove(department);
    }

    public void getAllDepartments() {
        for (Department dep : Department.departments) {
            System.out.println(dep.getName());
        }
    }

}

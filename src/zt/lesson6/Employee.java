package zt.lesson6;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age) {
        this(id, surname, age, 0.0, null);
    }

    public Employee(String surname, int age) {
        this(0, surname, age, 0.0, null);
    }

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ivanov", 35);
        Employee employee2 = new Employee("Petrov", 40);
        Employee employee3 = new Employee(2, "Sidorov", 45, 1800000, "IT");
    }
}
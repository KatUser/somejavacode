package zt;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    int department;

    Employee(int id, String surname, int age, double salary, int department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double doubleSalary() {
        return this.salary * 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Shpak", 40, 1000, 1);
        Employee emp2 = new Employee(3, "Kryak", 40, 3000, 4);

        System.out.println(emp1.doubleSalary());
        System.out.println(emp2.doubleSalary());
    }

}

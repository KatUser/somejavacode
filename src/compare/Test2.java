package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        Employee1 emp1 = new Employee1(100, "Zaur", "Tregolov", 12345);
        Employee1 emp2 = new Employee1(15, "Ivan", "Pertov", 5688);
        Employee1 emp3 = new Employee1(123, "Ivan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Collections.sort(list);
        System.out.println(list);
    }
}


class Employee1 implements Comparable<Employee1> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee1(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee1 anotherEmp) {
    /*    if(this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    } /* return this.id - anotherEmp.id */
        int res =   this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            return this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}
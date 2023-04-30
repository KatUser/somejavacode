package collectionsjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BinarySearch2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6245);
        Employee emp3 = new Employee(123, "Petr", 8547);
        Employee emp4 = new Employee(15, "Maria", 5678);
        Employee emp5 = new Employee(182, "Kolya", 125);
        Employee emp6 = new Employee(15, "Sasha", 5488);
        Employee emp7 = new Employee(250, "Elena", 1579);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index = Collections.binarySearch(employeeList, new Employee(182, "Kolya", 125));
        System.out.println(index);

    }
}

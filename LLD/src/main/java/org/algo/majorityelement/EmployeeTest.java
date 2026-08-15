package org.algo.majorityelement;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(5, "Alice");
        Employee emp2 = new Employee(4, "Bob");
        Employee emp3 = new Employee(5, "Charlie");

        System.out.println("Employee 1: " + emp1.getName() + ", Rating: " + emp1.getRating());
        System.out.println("Employee 2: " + emp2.getName() + ", Rating: " + emp2.getRating());
        System.out.println("Employee 3: " + emp3.getName() + ", Rating: " + emp3.getRating());

        List<Employee> employees = List.of(emp1, emp2, emp3);

        //
        employees.stream().sorted((Employee e1, Employee e2) -> Integer.compare(e2.getRating(), e1.getRating()))
                .forEach(e -> System.out.println("Sorted Employee: " + e.getName() + ", Rating: " + e.getRating()));

        // ascending order
        employees.stream().sorted(Comparator.comparing(Employee::getRating)).collect(Collectors.toList())
                .forEach(e -> System.out.println("Sorted Employee: " + e.getName() + ", Rating: " + e.getRating()));

        // reverse order
        employees.stream().sorted(Comparator.comparing(Employee::getRating).reversed()).collect(Collectors.toList())
                .forEach(e -> System.out.println("Sorted Employee: " + e.getName() + ", Rating: " + e.getRating()));
    }

}

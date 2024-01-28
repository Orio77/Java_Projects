package java_8_streams_api.problem14;

import java.util.Arrays;

// Java code

// Problem 14: Best Practices and Design Patterns

import java.util.List;
import java.util.OptionalDouble;

public class BestPracticesAndDesignPatterns {
    // Define an Employee class with an attribute for the salary.
    static class Employee {
        double salary;

        // Constructor
        public Employee(double salary) {
            this.salary = salary;
        }

        // Getter
        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        // Initialize a List of Employee objects with various salaries.
        List<Employee> employees = Arrays.asList(
            new Employee(50000.0),
            new Employee(60000.0),
            new Employee(70000.0),
            new Employee(80000.0),
            new Employee(90000.0),
            new Employee(0)
        );

        // Use a loop and conditionals to calculate the average salary of employees.
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        double averageSalary = employees.isEmpty() ? 0 : totalSalary / employees.size();

        // Refactor the loop and conditionals into a stream-based solution.
        OptionalDouble avgSalary = OptionalDouble.empty();
        if (employees.size() != 0)
            avgSalary = employees.stream().mapToDouble(e -> e.getSalary()).average();
        // Print the average salary to the console.
        System.out.println(averageSalary);
        System.out.println(avgSalary);
    }
}

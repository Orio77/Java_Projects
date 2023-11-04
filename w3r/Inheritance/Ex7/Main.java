package Inheritance.Ex7;

public class Main {
    public static void main(String[] args) {
        
        Employee employee_1 = new Employee("Josh", "Mosh", 123124, "Manager");

        System.out.println(employee_1.getFirstName() + " " + employee_1.getLastName() + " (" + employee_1.getEmployeeId() + ")");
    }
}


/*
7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
Create a subclass called Employee that adds a new method named getEmployeeId() 
and overrides the getLastName() method to include the employee's job title.
 */
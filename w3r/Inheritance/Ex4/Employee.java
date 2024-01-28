package Inheritance.Ex4;

public class Employee {
    private int Salary;

    public Employee(int salary) {
        this.Salary = salary;
    }
    

    public void work() {
        System.out.println("working, working");
    }
    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public void getSalary() {
        System.out.println(Salary);
    }
}

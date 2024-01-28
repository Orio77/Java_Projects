package Inheritance.Ex4;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(10_000);
        HRManager man1 = new HRManager(50_000);

        man1.getSalary();
        emp1.getSalary();

        emp1.work();
        man1.work();
        man1.newEmployee();
        
    }
}

package Inheritance.Ex4;

public class HRManager extends Employee{

    public HRManager(int salary) {
    super(salary);
    }

    public void newEmployee() {
        System.out.println("Adding an employee!");
    }


    

    @Override
    public void work() {
        System.out.println("Work faster!");
    }
}

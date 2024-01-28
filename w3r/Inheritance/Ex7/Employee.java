package Inheritance.Ex7;

public class Employee extends Person{

    private int employeeId;
    private String jobTitle;

    public Employee(String name, String lastName, int employeeId, String jobTitle) {
        super(name, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    @Override
    public String getLastName() {
        return super.getLastName() + " " + jobTitle;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    
}

package OOP.ex6;

public class Employee {
    private double salary;
    private String job_title;
    private String name;

    public void updateSalary(double salary) {
        this.salary = salary;
    }

    public double calculateSalary(double hourlyWage, double hoursWorked) {
        this.salary = hourlyWage * hoursWorked;
        return hourlyWage * hoursWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJobTitle(String job_title) {
        this.job_title = job_title;
    }

    public String getJobTitle() {
        return job_title;
    }

    public double getSalary() {
        return salary;
    }
}

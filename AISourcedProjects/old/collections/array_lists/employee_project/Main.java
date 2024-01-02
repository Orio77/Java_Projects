import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee(12345, "John", "back");
        Employee employee2 = new Employee(34566, "Rick", "front");
        Employee employee3 = new Employee(23567, "Dough", "front");
        Employee employee4 = new Employee(34867, "Calumn", "back");
        Employee employee5 = new Employee(45672, "Matt", "back");

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

        System.out.println(EmployeeList.filterByDepartment(empList, "front"));
        EmployeeList.removeByID(empList, 23567);
        EmployeeList.printEmployees(empList);
    }
}

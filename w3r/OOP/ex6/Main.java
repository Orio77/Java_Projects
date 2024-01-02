package OOP.ex6;

public class Main {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();

        employee1.setName("Josh");
        System.out.println(("Employee's name is: " + employee1.getName()));
        System.out.println("Employee's job title is: " + employee1.getJobTitle());
        employee1.calculateSalary(25, 40);
        System.out.println(employee1.getSalary());
        employee1.updateSalary(4000);
        System.out.println(employee1.getSalary());

    }
}

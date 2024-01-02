import java.util.ArrayList;

public class EmployeeList {
    
    //Creates new Array List with Employees of one department
    public static ArrayList<Employee> filterByDepartment(ArrayList<Employee> arrayList, String department) {

        ArrayList<Employee> newList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getDepartment().matches(department))
                newList.add(arrayList.get(i));
        }

        return newList;
    }

    //Removes an Employee with given ID
    public static void removeByID(ArrayList<Employee> arrayList, int id) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id)
                arrayList.remove(arrayList.get(i));
        }
    }

    //Prints the Employees data
    public static void printEmployees(ArrayList<Employee> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("----------");
            System.out.println("Employee " + i + ":");
            System.out.println("Employee name: " + arrayList.get(i).getName());
            System.out.println("Employee id: " + arrayList.get(i).getId());
            System.out.println("Employee department: " + arrayList.get(i).getDepartment());
        }
    }
}

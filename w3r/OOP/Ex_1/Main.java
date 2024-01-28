package OOP.Ex_1;

public class Main {
    public static void main(String[] args) {
    System.out.println();
    Person person_1 = new Person("John", 30);
    Person person_2 = new Person("Rick", 23);

    System.out.println("Person 1's name is: " + person_1.getName() + "\nPerson 1's age is: " + person_1.getAge());
    System.out.println();
    System.out.println("Person 2's name is: " + person_2.getName() + "\nPerson 2's age is: " + person_2.getAge());
    System.out.println();
    }
}

package OOP.Repeated.Ex_1_v2;

public class Main {
    public static void main(String[] args) {
        Person person_1 = new Person("Josh", 30);
        Person person_2 = new Person("Mosh", 26);

        System.out.println("First persons name is " + person_1.getName() + " " + "and their age is " + person_1.getAge());
        System.out.println("Second person is " + person_2.getName() + " " + "and their age is " + person_2.getAge());
    }
}





/*1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, 
set their attributes using the constructor, and print their name and age. */

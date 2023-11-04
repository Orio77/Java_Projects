package Inheritance.Ex1;

public class Animal {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Cat mycat = new Cat();
        Dog mydog = new Dog();

        animal.makeSound();
        mycat.makeSound();
        mydog.makeSound();
    }

    public void makeSound() {
        System.out.println("Animal make sounds");
    }
}


/*
1. Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark. 
*/
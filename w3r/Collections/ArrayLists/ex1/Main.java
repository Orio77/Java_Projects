package Collections.ArrayLists.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<>(); 

        Colors color = new Colors();

        color.addElement(colorList, "Blue");
        color.addElement(colorList, "Red");
        color.addElement(colorList, "Green");
        color.addElement(colorList, "Yellow");
        color.addElement(colorList, "Purple");
        color.printList(colorList);
    }
}


//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
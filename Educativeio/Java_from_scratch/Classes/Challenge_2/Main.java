package Java_from_scratch.Classes.Challenge_2;

public class Main {
    public static void main(String[] args) {
        
        Zebra zebra = new Zebra("Zebra", 20, "Africa");
        Dolphin dolphin = new Dolphin("Dolphin", 20, "Ocean");

        System.out.println(zebra.getData());
        System.out.println();
        System.out.println(dolphin.getData());
    }
}




/*A parent class named Animal.

Inside it define:
name
age
set_value(int a,string b):
sets age and name parameters and to the given values.
default constructor
Then there are two derived classes

Zebra
Dolphin
The derived classes should

Return a string containing a message telling the age and the name as well as information about place of origin of that animal */
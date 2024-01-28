package Learn_OOP_in_Java.Challenge_1_3;

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Rick", 6, 5);
        
        System.out.println(student1.calcTotal());
        System.out.println(student1.getMarks(1));
        System.out.println(student1.getMarks(2));
        System.out.println(student1.getMarks(10));
    }
}



/*
Write a Java class called Student with
private fields:
name ( String type)
mark1 and mark2 (double type)
And methods:
getMarks(int markNumber) , a method which should return mark1 if
markNumber equals 1 and mark2 otherwise.
calcTotal() method should take the two marks entered and return their
sum.
Also define two constructors:
A default constructor that takes no parameters and initializes the values to
zeros and null .
A constructor that takes the three variables and sets them as the values of
the appropriate fields.
 */

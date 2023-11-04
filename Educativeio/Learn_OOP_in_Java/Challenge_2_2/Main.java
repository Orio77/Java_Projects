package Learn_OOP_in_Java.Challenge_2_2;

public class Main {
    public static void main(String[] args) {

        Student student_1 = new Student();

        student_1.setName("John");
        student_1.setRollNumber("4452");

        System.out.print("Student's name is: ");
        System.out.println(student_1.getName());
        System.out.print("Student's roll number is: ");
        System.out.println(student_1.getRollNumber());
    }
}






/*You are given a Student class in the editor. Your task is to add two fields:
String name
String rollNumber
and provide getter/setters for these fields:
getName
setName
getRollNumber
setRollNumber
Implement this class according to the rules of encapsulation. */
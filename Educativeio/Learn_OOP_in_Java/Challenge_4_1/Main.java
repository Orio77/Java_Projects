package Learn_OOP_in_Java.Challenge_4_1;

public class Main {
    public static void main(String[] args) {
        
        Shape shape1 = new Xshape("Rectangle");
        Shape shape2 = new Shape();
        Xshape shape3 = new Xshape("Square");
        
        System.out.println(shape1.getName());
        System.out.println(shape2.getName());
        System.out.println(shape3.getName());
    }
}




/*Problem Statement #
When a method in a derived class overrides a method in a base class, it is still
possible to call the overridden method using the super keyword.
If you write super.method() , it will call the method that was defined in
the superclass.
You are given a partially completed code in the editor. The class Shape is the
base class of the XShape class. You have to modify the getName() method of
the devrived class, i.e XShape , so that the code returns the following:
Input #
Derived Class Name
Output #
Base Class Name, Derived Class Name */
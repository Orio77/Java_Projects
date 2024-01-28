package Learn_OOP_in_Java.Challenge_3_2;

public class Dell extends Laptop{

    public Dell() {
    }

    public Dell(String name) {
        super(name);
    }

    public String getDetails() {
        return getName();
    }
    
}

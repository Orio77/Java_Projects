package Learn_OOP_in_Java.Challenge_3_1;

public class Car extends Vehicle{
    
    private String name;

    public Car() {
        name = "";
    }

    public void setDetails(String name) {
        this.name = name;
    }

    public String getDetails(String carName) {
        String details = carName + ", " + getModel() + ", " + getSpeed();
        return details;
    }
}

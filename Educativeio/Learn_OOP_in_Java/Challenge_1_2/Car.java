package Learn_OOP_in_Java.Challenge_1_2;

public class Car {
    
    private String name;
    private String horsePower;
    private String maxSpeed;

    public void setName(String name) {
        this.name = name;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void getCarData() {
        System.out.println("Your car is called: " + name);
        System.out.println("It's Horse Power is: " + horsePower);
        System.out.println("It's maximum speed is: " + maxSpeed + "mph");
    }

    public void startEngine() {
        System.out.println("Engine Roaring");
    }

    public void drift() {
        System.out.println("skrrrrrrt");
    }


}

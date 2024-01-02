package oop.problem14.additional_tasks.addproblem_1;

public class Car extends Vehicle{
    private String make;
    private int year;
    private double price;
    
    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public Car() {
        this("idk", 2000, 50000.00);
    }

    public Car(boolean hasWheels, String colour, String name, String model, String make, int year, double price) {
        super(hasWheels, colour, name, model);
        this.make = make;
        this.year = year;
        this.price = price;
    }

    public Car(String make, int year, double price) {
        this.make = make;
        this.year = year;
        this.price = price;
    }



    
}

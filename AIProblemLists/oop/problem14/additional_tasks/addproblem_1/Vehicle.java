package oop.problem14.additional_tasks.addproblem_1;

public class Vehicle {
    public boolean hasWheels;
    public String colour;
    public String name;
    public String model;
    
    public Vehicle() {

    }

    public Vehicle(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public Vehicle(boolean hasWheels, String colour, String name) {
        this.hasWheels = hasWheels;
        this.colour = colour;
        this.name = name;
    }

    public Vehicle(boolean hasWheels, String colour, String name, String model) {
        this.hasWheels = hasWheels;
        this.colour = colour;
        this.name = name;
        this.model = model;
    }
}

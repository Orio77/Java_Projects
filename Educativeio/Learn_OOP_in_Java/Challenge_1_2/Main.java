package Learn_OOP_in_Java.Challenge_1_2;

public class Main {
    public static void main(String[] args) {
        
        Car firstCar = new Car();

        firstCar.setName("Ferrari");
        firstCar.setHorsePower("300");
        firstCar.setMaxSpeed("260");

        firstCar.getCarData();

        System.out.println();
        firstCar.startEngine();
        firstCar.drift();
    }
}

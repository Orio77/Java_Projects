package OOP.Ex_2;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog(null, null);
        dog1.setName("Woofer");
        dog1.setBreed("bitch");

        Dog dog2 = new Dog(null, null);
        dog2.setName("Barker");
        dog2.setBreed("male");

        System.out.println();
        System.out.println("Our first pet's name is " + dog1.getName() + ", it's breed is " + dog1.getBreed());
        System.out.println("Our second pet's name is " + dog2.getName() + ", it's breed is " + dog2.getBreed());
        System.out.println();
    }
}

package Java_from_scratch.Classes.Challenge_2;

public class Animal {
    
    private int age;
    private String name;
    private String origin;

    public Animal(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getData() {
        String data = "The name of the animal is: " + name + "\nThe age of the animal is: " + age + "\nThe country of origin of the animal is: " + origin;
        return data;
    }
}

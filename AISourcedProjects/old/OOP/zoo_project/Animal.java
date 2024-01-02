public abstract class Animal {
    private String name;
    private int age;

    public abstract void makeSound();
    public abstract void eat();

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
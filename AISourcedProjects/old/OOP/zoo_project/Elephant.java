public class Elephant extends Animal{
    private int trunkLength;

    public void makeSound() {
        System.out.println("Elephant makes sound");
    }

    public void eat() {
        System.out.println("Elephant is eating plants");
    }

    public int getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(int trunkLength) {
        this.trunkLength = trunkLength;
    }
}

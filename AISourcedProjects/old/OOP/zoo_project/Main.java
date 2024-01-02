public class Main {
    public static void main(String[] args) {
        
        Lion lion1 = new Lion();
        Elephant elephant1 = new Elephant();

        lion1.makeSound();
        lion1.setName("Fluffy");
        lion1.setManeLength(40);
        System.out.println(lion1.getName());
        System.out.println(lion1.getManeLength());
        lion1.eat();
        lion1.hunt("Antylope24");

        System.out.println();
        elephant1.makeSound();
        elephant1.setAge(17);
        elephant1.setTrunkLength(24);
        System.out.println(elephant1.getAge());
        System.out.println(elephant1.getTrunkLength());
        elephant1.eat();
    }
}

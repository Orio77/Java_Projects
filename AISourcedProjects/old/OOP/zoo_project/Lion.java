public class Lion extends Animal implements Carnivore{
    private int maneLength;

    public void makeSound() {
        System.out.println("Lion makes sound");
    }

    public void eat() {
        System.out.println("Lion is eating meat");
    }

    public int getManeLength() {
        return maneLength;
    }

    public void setManeLength(int maneLength) {
        this.maneLength = maneLength;
    }

    public void hunt(String target) {
        try {
            if (checkForNumbers(target)) {
                System.out.println("Lion is on the search for " + target);
                throw new IllegalArgumentException("Wrong Target");
            }
            else
                System.out.println("Lion spotted " + target);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Wrong target provided");
            target = "Zebra";
            System.out.println("Lion is on the hunt for " + target + " instead");
        }
    }
    public boolean checkForNumbers(String word) {

        for (int i = 1; i < word.length(); i++) {

            String letter = word.substring(i, i + 1);

            if (letter.matches("[0-9]+"))
                return true;
        }
        return false;
    }

    
}

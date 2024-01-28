package Learn_OOP_in_Java.Challenge_4_1;

public class Xshape extends Shape{
    private String name;

    public Xshape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return super.getName() + ", " + this.name;
    }
}

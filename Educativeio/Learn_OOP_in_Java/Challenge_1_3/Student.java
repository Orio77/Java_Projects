package Learn_OOP_in_Java.Challenge_1_3;

public class Student {
    
    private String name;
    private int mark1;
    private int mark2;

    public Student() {
        this.name = null;
        this.mark1 = 0;
        this.mark2 = 0;
    }

    public Student(String name, int mark_1, int mark_2) {
        mark1 = mark_1;
        mark2 = mark_2;
        this.name = name;
    }

    public int getMarks(int number) {

        if (number == 1) 
            return mark1;
        else 
            return mark2;
    }

    public double calcTotal() {
        return mark1 + mark2;
    }

}

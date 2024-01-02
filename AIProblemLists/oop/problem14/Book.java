package oop.problem14;

public class Book {
    private int pages;
    private String colour;

    public Book() {}

    public Book(int pages, String colour) {
        this.pages = pages;
        this.colour = colour;
    }

    public void printSuper() {
        System.out.println("super");
    }

    public int getPages() {
        return pages;
    }

    public String getColour() {
        return colour;
    }



    // Create the Textbook class
    static class Textbook extends Book{
        private String subject;
        private int weight;

        // Constructor(s) and methods will go here

        public Textbook() {
            this(300, "Philosophy", "Red", 1);
        }

        public Textbook(int pages, String subject, String colour, int weight) {
            super(pages, colour);
            this.subject = subject;
            this.weight = weight;
        }

        public String getSubject() {
            return subject;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public void printSuper() {
            for (int i = 0; i < 50; i++) {
                super.printSuper();
            }
        }
    }

    public static void main(String[] args) {

        // Create an instance of the Textbook class

        Book textbook1 = new Textbook();
        Textbook textbook2 = new Textbook();



        // Utilize 'this' and 'super' keywords in the Textbook class for constructor chaining and method overriding

        textbook1.printSuper(); //prints 'super' once
        System.out.println();
        textbook2.printSuper(); //prints 'super' 50 times
    }
}

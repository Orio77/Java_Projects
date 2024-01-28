package oop.problem10;

public class ExceptionHandlingInOOP {
    static class Book {
        private String title;
        private double price;

        // Constructor
        public Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        // Getter and Setter for price
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) throws InvalidPriceException {
            if (price < 0) {
                throw new InvalidPriceException("Price cannot be negative");
            }
        }

        public String getTitle() {
            return title;
        }
    }

    public static void main(String[] args) {
        // Section for creating a Book object
        Book book2 = new Book("FNAF", 10);
        // Section for setting the price of the book and handling the exception
        try {
            book2.setPrice(-100);
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(book2.getPrice());
    }
}

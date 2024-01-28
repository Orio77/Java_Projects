package oop.problem13;

interface Printable {
    // Section for declaring a print method
    public void print();
    // Section for adding a default method
    public default void defaultPrint() {
        System.out.println("Default Print");
    }
    // Section for adding a static method
    public static void staticPrint() {
        System.out.println("Static Print");
    }
}

class Document implements Printable {
    private String text;

    // Constructor
    public Document(String text) {
        this.text = text;
    }

    // Section for implementing the print method
    public void print() {
        System.out.println(text);
    }
}

public class InterfacePractise {
    public static void main(String[] args) {
        // Section for creating a Document object
        Document doc = new Document("Document");
        // Section for calling the print method
        doc.print();
        // Section for calling the default method
        doc.defaultPrint();
        // Section for calling the static method
        Printable.staticPrint();
    }
}

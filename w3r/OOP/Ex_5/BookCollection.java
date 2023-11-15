package OOP.Ex_5;

import java.util.ArrayList;

public class BookCollection {

    private ArrayList<Book> fantasyCollection;
    private ArrayList<Book> scifiCollection;
    private ArrayList<Book> romanseCollection;
    private ArrayList<Book> actionCollection;
    private ArrayList<Book> dramaCollection;

    public BookCollection(String name) {
    }

    public BookCollection() {
    fantasyCollection = new ArrayList<>();
    scifiCollection = new ArrayList<>();
    romanseCollection = new ArrayList<>();
    actionCollection = new ArrayList<>();
    dramaCollection = new ArrayList<>();
    }

    public void printAll() {

        System.out.print("Fantasy Collecton: ");
        System.out.println(fantasyCollection);
        System.out.print("Scifi Collecton: ");
        System.out.println(scifiCollection);
        System.out.print("Romans Collecton: ");
        System.out.println(romanseCollection);
        System.out.print("Action Collecton: ");
        System.out.println(actionCollection);
        System.out.print("Drama Collecton: ");
        System.out.println(dramaCollection);
    }

    public ArrayList<Book> getCollection(String name) {

        switch (name) {
            case "fantasyCollection":
                return fantasyCollection; 
            case "scifiCollection":
                return scifiCollection;
            case "romanseCollection":
                return romanseCollection;
            case "actionCollection":
                return actionCollection;
            case "dramaCollection":
                return dramaCollection;
            default:
                return null;
        }
    }

    public String getCollectionName(ArrayList<Book> collectionName) {

        if (collectionName == fantasyCollection)
            return "Fantasy Collection";
        else if (collectionName == scifiCollection)
            return "Scifi Collection";
        else if (collectionName == romanseCollection)
            return "Romanse Collection";
        else if (collectionName == actionCollection)
            return "Action Collection";
        else if (collectionName == dramaCollection)
            return "Drama Collection";
        else 
            return null;

    }

    public void listBooks(String collectionName) {
        System.out.println(collectionName);
    }

    public void addBook(ArrayList<Book> collectionName, Book Book) {
        
        collectionName.add(Book);
        System.out.println("Book " + Book +  " added to the " + getCollectionName(collectionName) + " successfully");
    }

    public void removeBook(ArrayList<Book> collectionName, Book Book) {
        collectionName.remove(Book);
        System.out.println("Book " + Book + " removed successfully");

        System.out.println(collectionName);
    }


    //Stworzyć parę kolekcji z kategoriami książek i na tym pracować


}

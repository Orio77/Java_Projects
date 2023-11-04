package GPT_Tasks.Task_1_$_LibraryItem;

public class Book implements LibraryItem{
    private String title;
    private String status;

    public Book(String title, String status) {
        this.title = title;
        this.status = status;
    }
    
    public void checkout() {
        System.out.println("Book checkout please");
    }
    public void returnItem() {
        System.out.println("Here is your book back");
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

}

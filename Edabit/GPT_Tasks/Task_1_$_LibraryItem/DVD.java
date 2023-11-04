package GPT_Tasks.Task_1_$_LibraryItem;

public class DVD implements LibraryItem{
    private String title;
    private String status;

    public DVD(String title, String status) {
        this.title = title;
        this.status = status;
    }
    
    public void checkout() {
        System.out.println("DVD checkout please");
    }
    public void returnItem() {
        System.out.println("Here is your DVD back");
    }

    public String getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }
}

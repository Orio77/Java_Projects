package GPT_Tasks.Task_1_$_LibraryItem;

public interface LibraryItem {
    
    abstract void checkout();
    abstract void returnItem();
    abstract String getStatus();
    abstract String getTitle();
}

package array_lists.task_management;

public class Task {
    private int id;
    private String description;
    private int priority;
    private boolean completed = false;

    public Task(int id, String description, int priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeTask() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return Integer.toString(priority) + ". " + description;
    }
}

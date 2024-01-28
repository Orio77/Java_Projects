package array_lists.task_management;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskManager {

    ArrayList<Task> taskList = new ArrayList<>();

    LinkedList<Task> priorityList = new LinkedList<>();
    
    public void addTask(Task task) {
        taskList.add(task);
    }

    public void queueTask(Task task) {

        if (priorityList.isEmpty()) {
            priorityList.add(task);
            return;
        }
        
        int i = 0;
        while (i < priorityList.size() && task.getPriority() > priorityList.get(i).getPriority()) {
            i++;
        }

        priorityList.add(i, task);
    }

    public void removeCompleted() {
        Iterator<Task> iterator = priorityList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().isCompleted() == true)
                iterator.remove();
        }
    }

    public void displayTasks() {
        System.out.println("Task List:");
        System.out.println(taskList);
        System.out.println();
        System.out.println("Queued tasks:");
        System.out.println(priorityList);
    }
}

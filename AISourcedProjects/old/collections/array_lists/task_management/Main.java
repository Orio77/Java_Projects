package array_lists.task_management;

public class Main {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        
        Task task1 = new Task(4216, "fill gaps", 10);
        Task task2 = new Task(4217, "complete course", 1);
        Task task3 = new Task(4218, "submit work", 4);
        Task task4 = new Task(4219, "complete test", 2);
        Task task5 = new Task(4220, "check answers", 3);
        Task task6 = new Task(4221, "mark test", 5);
        Task task7 = new Task(4222, "return test", 6);
        Task task8 = new Task(4223, "review test", 7);
        Task task9 = new Task(4224, "mark test", 8);
        Task task10 = new Task(4225, "return test", 9);
        Task task11 = new Task(4226, "review test", 10);
        Task task12 = new Task(4217, "write code", 5);
        Task task13 = new Task(4218, "test code", 1);
        Task task14 = new Task(4219, "fix bugs", 2);
        Task task15 = new Task(4220, "write documentation", 4);
        Task task16 = new Task(4221, "deploy", 6);

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);
        manager.addTask(task4);
        manager.addTask(task5);
        manager.addTask(task6);
        manager.addTask(task7);
        manager.addTask(task8);

        manager.queueTask(task9);
        manager.queueTask(task10);
        manager.queueTask(task11);
        manager.queueTask(task12);
        manager.queueTask(task13);
        manager.queueTask(task14);
        manager.queueTask(task15);
        manager.queueTask(task16);

        manager.displayTasks();

        task13.completeTask();
        task3.completeTask();
        task11.completeTask();

        manager.removeCompleted();

        manager.displayTasks();
    }
}

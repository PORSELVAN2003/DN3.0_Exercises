public class Test {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        taskManager.addTask(new Task(1, "Coding", "Pending"));
        taskManager.addTask(new Task(2, "Playing Games", "In Progress"));
        taskManager.addTask(new Task(3, "Shopping", "Completed"));

        System.out.println("All tasks:");
        taskManager.traverseTasks();
        System.out.println();

        Task task = taskManager.searchTaskById(2);
        if (task != null) {
            System.out.println("Searching task with ID 2...");
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }
        System.out.println();

        System.out.println("Deleting task with ID 1...");
        taskManager.deleteTaskById(1);

        System.out.println("All tasks after deletion:");
        taskManager.traverseTasks();
    }
}

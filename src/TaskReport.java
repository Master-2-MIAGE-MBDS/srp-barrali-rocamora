import java.util.List;

class TaskReport {
    public void printCompletedTasks(List<Task> tasks) {
        System.out.println("Taches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printOngoingTasks(List<Task> tasks) {
        System.out.println("Taches non terminees :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printPendingTasks(List<Task> tasks) {
        System.out.println("Taches en cours :");
        for (Task task : tasks) {
            if (!task.isPending()) {
                System.out.println(task);
            }
        }
    }
}
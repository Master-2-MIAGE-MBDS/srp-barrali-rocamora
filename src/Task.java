public class Task {
    private String title;
    private String description;
    private boolean completed;
    public boolean pending;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public boolean isCompleted() {
        return completed;
    }

    public boolean isPending() {
        return !completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    @Override
    public String toString() {
        return "Tache : " + title + " - " + description + " | Statut : " + (completed ? "Terminee" : "Non terminee");
    }
}
package classTasks.lessonEightTodoList;

public class Task {

    public String description;
    public int prioryty;
    public boolean isCompleted;

    public Task(String description, int prioryty) {
        this.description = description;
        this.prioryty = prioryty;
        this.isCompleted = false;
    }

    @Override
    public String toString() {
        return "Task{" +

                "description='" + description + '\'' +
                ", prioryty=" + prioryty +
                (isCompleted ? "X" : " ") +
                '}';
    }

}

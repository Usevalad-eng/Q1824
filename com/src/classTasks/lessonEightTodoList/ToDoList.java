package classTasks.lessonEightTodoList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ToDoList {

    private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addTask(){
        System.out.println("Enter description of the task");
        String description = scanner.nextLine();
        System.out.println("Enter priority");
        int priority = Integer.parseInt(scanner.nextLine());
        tasks.add(new Task(description,priority));
        System.out.println("Task is added");
    }

    public void markTaskAsCompleted(){
        listTasks();
        System.out.println("Enter task number for completed task");
        int index = Integer.parseInt(scanner.nextLine())-1;
        if (index>=0 && index<tasks.size()){
            tasks.get(index).isCompleted = true;
        }else {
            System.out.println("Number of task is not right");
        }
    }

    public void removeTask(){
        listTasks();
        System.out.println("Enter task to remove");
        int index = Integer.parseInt(scanner.nextLine())-1;
        if (index>=0 && index<tasks.size()){
            tasks.remove(index);
            System.out.println("Task is removed");
        }else {
            System.out.println("Number of task is not right");
        }
    }

    public void listUncompletedTask(){
        boolean isUncompleted = false;
        for (int i = 0;i<tasks.size();i++){
            if (!tasks.get(i).isCompleted){
                System.out.println((i+1) + " " + tasks.get(i));
                isUncompleted = true;
            }
        } if (!isUncompleted){
            System.out.println("There are no uncompleted tasks");
        }

    }
    public void listTasks(){
        if (tasks.isEmpty()){
            System.out.println("List of tasks is empty");
        }else {
            for (int i =0; i<tasks.size();i++){
                System.out.println((i+1) + " " + tasks.get(i));
            }
        }
    }

    public void sortTaskByPriority(){
        tasks.sort(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return Integer.compare(o2.prioryty,o1.prioryty);
            }
        });
        System.out.println(tasks);
        System.out.println("Task are sorted");
    }

    public void run(){
        while (true){
            System.out.println("\n----Menu----");
            System.out.println("1 Add task");
            System.out.println("2 Mark task as completed");
            System.out.println("3 Remove task");
            System.out.println("4 List of tasks");
            System.out.println("5 List of unfinished tasks");
            System.out.println("6 Sort tasks by priority");
            System.out.println("0 Exit");
            System.out.println("Choose the task");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    markTaskAsCompleted();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    listTasks();
                    break;
                case 5:
                    listUncompletedTask();
                    break;
                case 6:
                    sortTaskByPriority();
                    break;
                case 0:
                    System.out.println("Program is finished");
                    return;
                default:
                    System.out.println("Not right choice");

            }
        }
    }

}


package taskmanager;
import java.util.ArrayList;


public class taskmanager {
    ArrayList<Task> taskList = new ArrayList<>();
    public void addTask(String Title) {
        taskList.add(new Task(Title));
    }
    public void removeTask(int index) {
        taskList.remove(index);
    }
    public void showList(){
        for (int i = 0; i < this.taskList.size(); i++){
            Task task = this.taskList.get(i);
            System.out.println(i + ": " + task.getTitle() + " - " + (task.getIsDone() ? "Done" : "Not Done"));
        }
    }
    public void saveList(String filename) {
        // Code to save the task list to a file
    }
}

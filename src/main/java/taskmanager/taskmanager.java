
package taskmanager;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
        try (FileWriter writer = new FileWriter(filename)) {
            String json = new Gson().toJson(taskList);
            writer.write(json);
            System.out.println("Task list saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving task list to file: " + e.getMessage());
        }
    }
    public void loadList(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            Type taskListType = new TypeToken<ArrayList<Task>>(){}.getType();
            this.taskList = new Gson().fromJson(reader, taskListType);
        } catch (IOException e) {
            System.err.println("Error loading task list from file: " + e.getMessage());
        }
    }
    public ArrayList<Task> getTaskList() {
        return this.taskList;
    }
}

package taskmanager;
public class task {
    boolean isDone;
    String Title;
    public task(String Title) {
        this.Title = Title;
        this.isDone = false;
    }
    public void markAsDone() {
        this.isDone = true;
    }
    public void markAsNotDone() {
        this.isDone = false;
    }
    public String getTitle(){
        return this.Title;
    }
    public boolean getIsDone() {
        return this.isDone;
    }
}

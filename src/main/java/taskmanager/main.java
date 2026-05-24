package taskmanager;
import java.util.Scanner;
public class main {
    private taskmanager manager;
    
    public main() {
        this.manager = new taskmanager();
    }
    
    public static void main(String[] args) {
        main mainInstance = new main();
        while (true) {
            mainInstance.askUserInput();
        }
    }

    public void askUserInput() {
        System.out.println("Enter a command (add, remove, show, save, load, markasdone, markasnotdone, exit):");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        switch (command) {
            case "add":
                System.out.println("Enter task title:");
                String title = scanner.nextLine();
                manager.addTask(title);
                break;
            case "remove":
                System.out.println("Enter task index to remove:");
                int index = scanner.nextInt();
                manager.removeTask(index);
                break;
            case "show":
                manager.showList();
                break;
            case "save":
                System.out.println("Enter filename to save:");
                String saveFilename = scanner.nextLine();
                manager.saveList(saveFilename);
                break;
            case "load":
                System.out.println("Enter filename to load:");
                String loadFilename = scanner.nextLine();
                manager.loadList(loadFilename);
                break;
            case "markasdone":
                System.out.println("Enter task index to mark as done:");
                int doneIndex = scanner.nextInt();
                manager.getTaskList().get(doneIndex).markAsDone();
                break;
            case "markasnotdone":
                System.out.println("Enter task index to mark as not done:");
                int notDoneIndex = scanner.nextInt();
                manager.getTaskList().get(notDoneIndex).markAsNotDone();
                break;
            case "exit":
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Unknown command.");
        }
    }
}
package classes;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static volatile Undo instance;
    private List<String> commandHistory;

    private Undo() {
        this.commandHistory = new ArrayList<>();
    }

    public static synchronized Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public List<String> getCommandHistory() {
        return this.commandHistory;
    }

    public void addCommand(String command) {
        Undo.getInstance().getCommandHistory().add(command);
    }

    public void deleteLastCommand() {
        if (!Undo.getInstance().getCommandHistory().isEmpty()) {
            System.out.println("Deleting: " + Undo.getInstance().getCommandHistory().getLast() + "...");
            Undo.getInstance().getCommandHistory().removeLast();
            System.out.println("Last command has been deleted.");

        } else {
            System.out.println("There are no commands to delete.");
        }
    }

    public void listCommandHistory() {
        if (!Undo.getInstance().getCommandHistory().isEmpty()) {
            System.out.println("Command history: ");
            for (String command : Undo.getInstance().getCommandHistory()) {
                System.out.println(command);
            }
        } else {
            System.out.println("We couldn't find a command history, please create one!");
        }
    }

    @Override
    public String toString() {
        return "Undo{" +
                "commandHistory=" + commandHistory +
                '}';
    }
}

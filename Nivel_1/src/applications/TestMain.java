package applications;

import classes.Undo;

import java.util.Scanner;

public class TestMain {

    public static void testMain1() {

        Scanner scanner = new Scanner(System.in);
        Undo commandHistory = new Undo();
        String option, command;
        while (true) {
            System.out.println("""
                    Choose an option with 1,2,3,4 \
                    
                    1.Add a command.\
                    
                    2.Delete last command.\
                    
                    3.List all commands.\
                    
                    4.Exit app.""");
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Introduce a command: ");
                    command = scanner.nextLine();
                    commandHistory.addCommand(command);
                    break;
                case "2":
                    commandHistory.deleteLastCommand();
                    break;
                case "3":
                    commandHistory.listCommandHistory();
                    break;
                case "4":
                    System.out.println("Thanks for using our app. Hope we see you again soon!");
                    scanner.close();
                    return;
                default:
                    System.out.println("You have to choose a valid option, please write 1,2,3 or 4 in order to use our service.");

            }
        }
    }
}

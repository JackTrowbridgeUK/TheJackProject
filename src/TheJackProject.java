import Managers.CommandManager;

public class TheJackProject {
    public static void main(String[] args){
        CommandManager commandManager = new CommandManager();

        // Register Commands
        commandManager.registerMenuItems();

        // Print Commands
        commandManager.printMenuItems();

    }
}

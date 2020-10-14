package Commands;

import Managers.CommandManager;
import Managers.FileManager;
import Objects.MenuItem;

import java.io.File;

public class installCommand extends MenuItem {
    public static boolean isInstalled = false;

    public installCommand(){ super("Install", "Creates an environment so you can use this application correctly.", "install"); }

    @Override
    public void execute() {
        FileManager fileManager = new FileManager();
        CommandManager commandManager = new CommandManager();

        if(isInstalled) {
            System.out.println("You've already installed the project! If this is incorrect type 'installoverride'.");
            commandManager.printMenuItems();
        }

        System.out.println("Installing...");

        System.out.println("Attempting to create the logs file...");
        fileManager.createLogFile();

        System.out.println("Writing to the logs file...");
        fileManager.log(fileManager.logFileLocation, "First installation was ran", 0);



        commandManager.printMenuItems();
    }
}

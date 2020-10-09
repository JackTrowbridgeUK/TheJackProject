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
        System.out.println("Installing...");

        System.out.println("Attempting to create the logs file...");
        fileManager.createLogFile();

        System.out.println("Writing to the logs file...");
        fileManager.log(fileManager.logFileLocation, "The install command was ran!", 0);

        System.out.println("That's all folks!");

        commandManager.printMenuItems();
    }
}

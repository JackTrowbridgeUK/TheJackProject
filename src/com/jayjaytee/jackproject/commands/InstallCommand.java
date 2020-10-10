package com.jayjaytee.jackproject.commands;

import com.jayjaytee.jackproject.managers.CommandManager;
import com.jayjaytee.jackproject.managers.FileManager;
import com.jayjaytee.jackproject.objects.MenuItem;

public class InstallCommand extends MenuItem {
    public static boolean isInstalled = false;

    public InstallCommand() {
        super("Install", "Creates an environment so you can use this application correctly.", "install");
    }

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

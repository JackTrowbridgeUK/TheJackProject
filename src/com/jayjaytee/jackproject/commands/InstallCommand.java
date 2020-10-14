package com.jayjaytee.jackproject.commands;

import com.jayjaytee.jackproject.managers.CommandManager;
import com.jayjaytee.jackproject.managers.FileManager;
import com.jayjaytee.jackproject.managers.InstallManager;
import com.jayjaytee.jackproject.objects.MenuItem;

public class InstallCommand extends MenuItem {
    public static boolean isInstalled = false; // TODO: Write/Read this to/from a file

    public InstallCommand() {
        super("Install", "Creates an environment so you can use this application correctly.", "install", true);
    }

    @Override
    public void execute() {
        //FileManager fileManager = new FileManager();
        CommandManager commandManager = new CommandManager();
        InstallManager installManager = new InstallManager();

        if(isInstalled) {
            System.out.println("You've already installed the project! If this is incorrect type 'installoverride'.");
            commandManager.printMenuItems();
        }

        installManager.install();

        commandManager.printMenuItems();
    }
}

package com.jayjaytee.jackproject.managers;

public class InstallManager {
    public void install(){
        FileManager fileManager = new FileManager();
        //CommandManager commandManager = new CommandManager();

        System.out.println("Installing...");

        System.out.println("Attempting to create the program files directory...");
        fileManager.createProgramFolder();

        System.out.println("Attempting to create the logs file...");
        fileManager.createLogFile();

        System.out.println("Writing to the logs file...");
        fileManager.log(fileManager.logFileLocation, "First installation was ran", 0);
    }
}

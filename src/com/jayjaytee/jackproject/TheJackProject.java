package com.jayjaytee.jackproject;

import com.jayjaytee.jackproject.managers.CommandManager;

public class TheJackProject {
    public static void main(String[] args){
        CommandManager commandManager = new CommandManager();

        // Register commands
        commandManager.registerMenuItems();

        // Print commands
        commandManager.printMenuItems();

    }
}

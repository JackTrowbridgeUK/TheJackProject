package com.jayjaytee.jackproject.managers;

import com.jayjaytee.jackproject.commands.InstallCommand;
import com.jayjaytee.jackproject.objects.MenuItem;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandManager {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    // Must be initialized before print
    public void registerMenuItems(){
        menuItems.add(new InstallCommand());
    }


    // Returns user input
    public String outputUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // Prints everything that's been registered
    public void printMenuItems(){
        System.out.println(" ");
        System.out.println(" ----------------- ");
        System.out.println(" ");
        for(MenuItem item : menuItems){ System.out.println(item.getDisplayName() + " -> " + item.getDisplayDescription()); }
        System.out.println(" ");
        System.out.println(" --- Type here ---");
        String output = outputUserInput();
        System.out.println(" ");

        for(MenuItem item : menuItems){
            if(output.equalsIgnoreCase(item.getCommandUsage())) { item.execute(); }
        }

        System.out.println("Unknown command! Please retype your command.");
        printMenuItems();

    }

}

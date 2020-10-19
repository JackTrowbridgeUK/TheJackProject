package com.jayjaytee.jackproject.managers;

import com.jayjaytee.jackproject.utils.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    public String userDirectory = System.getProperty("user.dir");

    public String logFileLocation = "logs.txt";
    public String programFolderLocation = userDirectory + "\\TheJackProject\\";

    public void createLogFile(){
        try{
            File logFile = new File(programFolderLocation + logFileLocation);
            if(logFile.createNewFile()){ System.out.println("Successfully created the logs file."); }
            else { System.out.println("The logs file already exists. (skipping) (Error: dtb10)"); }
        }catch(IOException e){
            System.out.println("An error occurred whilst creating the logs file.");
        }
    }

    public void createProgramFolder(){
        try{
            Path path = Paths.get(programFolderLocation);
            Files.createDirectories(path);
            System.out.println("The program files directory were successfully created!");
        }catch(IOException e){
            System.out.println("An error occurred whilst creating the program files directory.");
        }
    }

    public void log(String destination, String message, int logLevel){
        File currentFile = new File(programFolderLocation + destination);
        if(currentFile.isFile()){
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile, true));
                writer.write(FileUtils.getCurrentTime() + " " + message + " -" + logLevel);
                writer.write(System.getProperty("line.separator"));
                writer.close();
            }catch(IOException e){
                System.out.println("An error occurred whilst writing to " + destination);
            }
        }else{ System.out.println("That file doesn't exist! Please try again."); }
    }

}

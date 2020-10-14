package Managers;

import Utils.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public String logFileLocation = "logs.txt";

    public void createLogFile(){
        try{
            File logFile = new File(logFileLocation);
            if(logFile.createNewFile()){ System.out.println("Successfully created the logs file."); }
            else { System.out.println("The logs file already exists. (skipping) (Error: dtb10"); }
        }catch(IOException e){
            System.out.println("An error occurred whilst creating the logs file.");
        }
    }

    public void log(String destination, String message, int logLevel){
        File currentFile = new File(destination);
        if(currentFile.isFile()){
            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter(destination, true));
                writer.write(FileUtils.getCurrentTime() + " " + message + " -" + logLevel);
                writer.write(System.getProperty("line.separator"));
                writer.close();
            }catch(IOException e){
                System.out.println("An error occurred whilst writing to " + destination);
            }
        }else{ System.out.println("That file doesn't exist! Please try again."); }
    }

}

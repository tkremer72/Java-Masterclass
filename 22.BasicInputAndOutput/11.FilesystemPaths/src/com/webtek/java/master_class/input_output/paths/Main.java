package com.webtek.java.master_class.input_output.paths;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);

        System.out.println("**********************");
        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        printFile(filePath);

        System.out.println("**********************");
        Path absolutePath = Paths.get(".","files", "SubdirectoryFile.txt");//this did not work like the instructors
        printFile(absolutePath);

        System.out.println("**********************");
        Path outTherePath = Paths.get("D:\\Further Learning\\Java-Masterclass\\22.BasicInputAndOutput\\OutThereFile.txt");
        printFile(outTherePath);

        System.out.println("**********************");
        Path directoryPath = Paths.get(".");
        System.out.println("The absolute file path is: " + directoryPath.toAbsolutePath());//Prints out the absolute path of this projects location

        System.out.println("**********************");
        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());
    }
    private static void printFile(Path path) {
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null)
                System.out.println(line);
        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

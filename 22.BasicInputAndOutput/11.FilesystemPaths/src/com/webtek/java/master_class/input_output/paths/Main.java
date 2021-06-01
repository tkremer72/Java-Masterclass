package com.webtek.java.master_class.input_output.paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {
            //Copy a file and replace the existing if there is an existing
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1Copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

//            //Copy a directory and replace the existing directory if there is one
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            // Move a file
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1Copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "file1Copy.txt");
//            Files.move(fileToMove, destination);

            //Rename a file
//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Files.move(fileToMove, destination);

            //Delete a file
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1Copy.txt");
//            Files.delete(fileToDelete); // or Files.deleteIfExists(fileToDelete);

            //Create a file using the Files class
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);

            //Create a directory
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

            //Create a directory in a directory or multiple directories
//            Path directoriesToCreate = FileSystems.getDefault().getPath("Examples","Dir2/Dir3/Dir4/Dir5/Dir6");
//            Files.createDirectories(directoriesToCreate);
            //or
//            Path directoriesToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//            Files.createDirectories(directoriesToCreate);

            //Getting file attributes or metadata
            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("File size = " + size);
            System.out.println("Last modified date = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attr = Files.readAttributes(filePath,BasicFileAttributes.class);
            System.out.println("Size = " + attr.size());
            System.out.println("Last modified = " + attr.lastModifiedTime());
            System.out.println("Created = " + attr.creationTime());
            System.out.println("Is Directory = " + attr.isDirectory());
            System.out.println("Is regular file = " + attr.isRegularFile());

        } catch(IOException io) {
            System.out.println(io.getMessage());
        }

    }
}
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
//        System.out.println("**********************");
//        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        printFile(filePath);
//
//        System.out.println("**********************");
//        Path absolutePath = Paths.get(".","files", "SubdirectoryFile.txt");//this did not work like the instructors
//        printFile(absolutePath);
//
//        System.out.println("**********************");
//        Path outTherePath = Paths.get("D:\\Further Learning\\Java-Masterclass\\22.BasicInputAndOutput\\OutThereFile.txt");
//        printFile(outTherePath);
//
//        System.out.println("**********************");
//        Path directoryPath = Paths.get(".");
//        System.out.println("The absolute file path is: " + directoryPath.toAbsolutePath());//Prints out the absolute path of this projects location
//
//        System.out.println("**********************");
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("thisFileDoesntExist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        // Can't create bogus files and paths like below
//        Path path4 = Paths.get("D:/Bing/Bing/Ding", "abcdef", "nothappening.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files"); //does exist
//        System.out.println("Exists = " + Files.exists(filePath));
//        System.out.println("Exists = " + Files.exists(path4)); //does not exist
//

//   }

//    private static void printFile(Path path) {
//        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while((line = fileReader.readLine()) != null)
//                System.out.println(line);
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }


//}

package com.webtek.java.master_class.basic_input_output.directories;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
            //Reading existing directory contents
//	        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
//	        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory)){
//	            for(Path file: contents) {
//                    System.out.println(file.getFileName());
//                }
//            } catch(IOException | DirectoryIteratorException io) {
//                System.out.println(io.getMessage());
//            }

        //Filtering the results of reading a directory
//        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
//        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, "*.{dat,txt}")){ //returns all files with those extensions
//            for(Path file: contents) {
//                System.out.println(file.getFileName());
//            }
//        } catch(IOException | DirectoryIteratorException io) {
//            System.out.println(io.getMessage());
//        }

        //Write a filter that only returns files and not directories

//        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<>() {
//            public boolean accept(Path path) throws IOException {
//                return (Files.isRegularFile(path));
//            }
//        };
        //Above filter using a lambda expression
        //DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
        //code on line 37 using a method reference
//        DirectoryStream.Filter<Path> filter = Files::isRegularFile;
//
//        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
//        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)){
//            for(Path file: contents) {
//                System.out.println(file.getFileName());
//            }
//        } catch(IOException | DirectoryIteratorException io) {
//            System.out.println(io.getMessage());
//        }
//        //Get the file separator
//        String separator = File.separator;
//        System.out.println(separator);
//        separator = FileSystems.getDefault().getSeparator();
//        System.out.println(separator);

        //Below shows how to build the path without hard coding like on line 42
        DirectoryStream.Filter<Path> filter = Files::isRegularFile;

        Path directory = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)){
            for(Path file: contents) {
                System.out.println(file.getFileName());
            }
        } catch(IOException | DirectoryIteratorException io) {
            System.out.println(io.getMessage());
        }
        //Get the file separator
        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        //Create temporary files in a computer generated location
        try {
            Path tempFile = Files.createTempFile("myApp", ".appext");
            System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //Get the file stores or drives
        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store : stores) {
            System.out.println("Volume name & drive letter = " +store);//returns volume name and drive letter
            System.out.println("Volume name = " + store.name()); //returns volume name
        }
        System.out.println("*****************************************");

        //Below gets the root paths but not recommended and usually don't need to get the root drive
        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for(Path path : rootPaths) {
            System.out.println(path);
        }
        System.out.println("-----Walking Tree For Dir2-----");
        Path dir2Path = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir2");
        try {
            Files.walkFileTree(dir2Path, new PrintNames());

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        //Copy directory to another directory
        System.out.println("------Copy Dir2 to Dir4/Dir2Copy-----");
        Path copyPath = FileSystems.getDefault().getPath("FileTree" + File.separator + "Dir4" + File.separator + "Dir2Copy");
        //FileTree/Dir4/Dir2Copy
        try {
            Files.walkFileTree(dir2Path,new CopyFiles(dir2Path, copyPath));
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //Mapping I/O and NIO methods

        File file = new File("/Examples/file.txt");
        Path convertedPath = file.toPath();
        System.out.println(convertedPath);

        File parent = new File("/Examples");
        File resolvedFile = new File(parent, "dir/file.txt");
        System.out.println(resolvedFile.toPath());

        resolvedFile = new File("/Examples", "dir/file.txt");
        System.out.println(resolvedFile.toPath());
    //The above code is the equivalent of the below code
        Path parentPath = Paths.get("/Examples");
        Path childRelativePath = Paths.get("dir/file.txt");
        System.out.println(parentPath.resolve(childRelativePath));

        //Robust hack for getting the file working directory
        File workingDirectory = new File("").getAbsoluteFile();
        System.out.println("Working directory = " + workingDirectory.getAbsolutePath());

        System.out.println("----- Print Dir2 contents using list() -----");
        File dir2File = new File(workingDirectory, "/FileTree/Dir2");
        String[] dir2Contents = dir2File.list();
        for(int i = 0; i < dir2Contents.length; i++) {
            System.out.println("i = " + i + ": " + dir2Contents[i]);
        }

        System.out.println("---- Print Dir2 contents using listFiles()----");
        File[] dir2Files = dir2File.listFiles();
        for(int i = 0; i < dir2Files.length; i++) {
            System.out.println("i = " + i + ": " + dir2Files[i].getName());
        }
    }
}

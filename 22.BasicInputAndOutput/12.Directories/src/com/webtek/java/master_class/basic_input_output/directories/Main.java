package com.webtek.java.master_class.basic_input_output.directories;

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
        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory)){
            for(Path file: contents) {
                System.out.println(file.getFileName());
            }
        } catch(IOException | DirectoryIteratorException io) {
            System.out.println(io.getMessage());
        }
    }
}

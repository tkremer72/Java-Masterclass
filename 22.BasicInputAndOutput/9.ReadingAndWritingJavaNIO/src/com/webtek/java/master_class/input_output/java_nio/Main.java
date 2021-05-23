package com.webtek.java.master_class.input_output.java_nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Writing to a text file
//	try {
////        FileInputStream file = new FileInputStream("data.txt");
////        FileChannel channel = file.getChannel();
//        Path dataPath = FileSystems.getDefault().getPath("data.txt");
//        Files.write(dataPath, "\nLine 2\nLine 3\nLine 4\nLine 5\nLine 6\nLine 7\nLine 8\nLine 9\nLine 10\nLine 11".getBytes("UTF-8"), StandardOpenOption.APPEND);//writes text to the txt file.
//        List<String> lines = Files.readAllLines(dataPath);
//        for(String line : lines) {
//            System.out.println(line);
//        }
//    } catch(IOException io) {
//	    io.printStackTrace();
//    }

        //Writing binary files
        try(FileOutputStream binaryFile = new FileOutputStream("data.dat");
            FileChannel binaryChannel = binaryFile.getChannel()) {

            byte[] outputBytes = "Hello World!".getBytes();
            //we need a buffer because we are writing to a file
            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            int numberOfBytes = binaryChannel.write(buffer);
            System.out.println("Number of bytes written was: " + numberOfBytes);

            ByteBuffer integerBuffer = ByteBuffer.allocate(Integer.BYTES);
            integerBuffer.putInt(245);
            integerBuffer.flip();
            numberOfBytes = binaryChannel.write(integerBuffer);
            System.out.println("Number of bytes written was: " + numberOfBytes);

            integerBuffer.flip();
            integerBuffer.putInt(-98765);
            integerBuffer.flip();
            numberOfBytes = binaryChannel.write(integerBuffer);
            System.out.println("Number of bytes written was: " + numberOfBytes);

        } catch(IOException e) {
            System.out.println("I/O Exception Thrown! " + e.getMessage());
        }
    }
}

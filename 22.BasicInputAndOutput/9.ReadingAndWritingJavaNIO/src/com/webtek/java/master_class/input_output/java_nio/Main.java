package com.webtek.java.master_class.input_output.java_nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.RandomAccessFile;
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
        try (FileOutputStream binaryFile = new FileOutputStream("data.dat");
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

            //using RandomAccessFile to read data which is part of the I/O package
//            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
//            byte[] b = new byte[outputBytes.length];
//            randomAccessFile.read(b);
//            System.out.println(new String(b));
//            long int1 = randomAccessFile.readInt();
//            long int2 = randomAccessFile.readInt();
//            System.out.println(int1);
//            System.out.println(int2);

            //Using RandomAccessFile to read data using the nio package
            RandomAccessFile randomAccessFile = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = randomAccessFile.getChannel();
            outputBytes[0] = 'a';
            outputBytes[1] = 'b';
            buffer.flip();//Always remember to call the flip method
            long numBytesRead = channel.read(buffer);
            if(buffer.hasArray()) {
                System.out.println("Byte buffer = " + new String(buffer.array()));
            }
//          Relative read
//            integerBuffer.flip();
//            numBytesRead = channel.read(integerBuffer);
//            integerBuffer.flip();
//            System.out.println(integerBuffer.getInt());
//            integerBuffer.flip();
//            numBytesRead = channel.read(integerBuffer);
//            integerBuffer.flip();
//            System.out.println(integerBuffer.getInt());
//          Absolute read
            integerBuffer.flip();
            numBytesRead = channel.read(integerBuffer);
            System.out.println(integerBuffer.getInt(0));
            integerBuffer.flip();
            numBytesRead = channel.read(integerBuffer);
            System.out.println(integerBuffer.getInt(0));
            System.out.println("The number of bytes read is " + numBytesRead);
            
            channel.close();
            randomAccessFile.close();
           // System.out.println("Output bytes = " + new String(outputBytes));

        } catch (IOException e) {
            System.out.println("I/O Exception Thrown! " + e.getMessage());
        }
    }
}

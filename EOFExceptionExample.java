/*
 * Summary:
 * This file demonstrates how to trigger and handle an EOFException in Java.
 * The exception is triggered by attempting to read beyond the end of a file.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("example.txt"));
            while (true) {
                int data = dataInputStream.readInt();
                System.out.println("Data: " + data);
            }
        } catch (EOFException e) {
            System.out.println("EOFException occurred: Reached end of file.");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

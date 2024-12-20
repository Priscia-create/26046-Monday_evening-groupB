/*
 * Summary:
 * This file demonstrates how to trigger and handle an IOException in Java.
 * The exception is triggered by attempting to read a non-existent file.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent_file.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

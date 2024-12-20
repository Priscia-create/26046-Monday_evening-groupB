/*
 * Summary:
 * This file demonstrates how to trigger and handle a FileNotFoundException in Java.
 * The exception is triggered by attempting to open a non-existent file.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occurred: " + e.getMessage());
        }
    }
}

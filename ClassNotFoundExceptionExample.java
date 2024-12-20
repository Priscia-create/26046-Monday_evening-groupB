/*
 * Summary:
 * This file demonstrates how to trigger and handle a ClassNotFoundException in Java.
 * The exception is triggered by attempting to load a class that does not exist.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("non.existent.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }
}

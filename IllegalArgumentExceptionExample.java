/*
 * Summary:
 * This file demonstrates how to trigger and handle an IllegalArgumentException in Java.
 * The exception is triggered by passing an invalid argument to a method.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException occurred: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

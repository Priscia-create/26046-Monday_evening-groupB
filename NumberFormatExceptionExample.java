/*
 * Summary:
 * This file demonstrates how to trigger and handle a NumberFormatException in Java.
 * The exception is triggered by attempting to parse an invalid number from a string.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
    }
}

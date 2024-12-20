/*
 * Summary:
 * This file demonstrates how to trigger and handle an ArithmeticException in Java.
 * The exception is triggered by performing division by zero.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }
    }
}

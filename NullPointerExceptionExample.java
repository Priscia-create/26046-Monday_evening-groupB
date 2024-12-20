/*
 * Summary:
 * This file demonstrates how to trigger and handle a NullPointerException in Java.
 * The exception is triggered by accessing a method on a null reference.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}

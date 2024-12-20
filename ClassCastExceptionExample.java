/*
 * Summary:
 * This file demonstrates how to trigger and handle a ClassCastException in Java.
 * The exception is triggered by attempting to cast an object to an incompatible type.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred: " + e.getMessage());
        }
    }
}

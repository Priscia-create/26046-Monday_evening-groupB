/*
 * Summary:
 * This file demonstrates how to trigger and handle an ArrayIndexOutOfBoundsException in Java.
 * The exception is triggered by attempting to access an invalid index in an array.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}

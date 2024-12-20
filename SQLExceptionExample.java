/*
 * Summary:
 * This file demonstrates how to trigger and handle an SQLException in Java.
 * The exception is triggered by attempting to connect to a non-existent database.
 * The program handles the exception using a try-catch block and prints an appropriate error message.
 */

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQLException occurred: " + e.getMessage());
        }
    }
}

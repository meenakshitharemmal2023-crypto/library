package com.library;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter User Name: ");
        String name = sc.nextLine();
        System.out.print("Enter User ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Number of Books Issued: ");
        int numBooks = sc.nextInt();
        System.out.print("Enter Borrowing Duration (Days): ");
        int days = sc.nextInt();

        // Constants for Calculation
        int allowedLimit = 14; // Allowed limit is 14 days
        double finePerDay = 5.0; // Fine is 5 units per extra day
        double totalFine = 0;

        // Calculate Fine
        if (days > allowedLimit) {
            int extraDays = days - allowedLimit;
            totalFine = extraDays * finePerDay;
        }

        // Display Details
        System.out.println("\n--- Library Borrowing Status ---");
        System.out.println("User: " + name + " (ID: " + id + ")");
        System.out.println("Books Issued: " + numBooks);
        System.out.println("Borrowing Days: " + days);
        System.out.println("Total Fine: " + totalFine);
        
        sc.close();
    }
}

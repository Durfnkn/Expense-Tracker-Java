package com.expensetracker;

import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("\n==== Expense Tracker Menu ====");
            System.out.println("1. Add Food Expense");
            System.out.println("2. Add Travel Expense");
            System.out.println("3. Add Entertainment Expense");
            System.out.println("4. Add Shopping Expense");
            System.out.println("5. Show All Expenses");
            System.out.println("6. Show Total Expense");
            System.out.println("7. Exit");

            System.out.print("Enter choice (1-7): ");
            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Invalid input! Enter a number between 1-7.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID,Title,Amount,GST: ");
                    String[] parts = sc.nextLine().split(",");
                    manager.addExpense(new FoodExpense(
                            Integer.parseInt(parts[0].trim()),
                            parts[1].trim(),
                            Double.parseDouble(parts[2].trim()),
                            Double.parseDouble(parts[3].trim())
                    ));
                    System.out.println("Food expense added!");
                }
                case 2 -> {
                    System.out.print("Enter ID,Title,Amount,DistanceCost: ");
                    String[] parts = sc.nextLine().split(",");
                    manager.addExpense(new TravelExpense(
                            Integer.parseInt(parts[0].trim()),
                            parts[1].trim(),
                            Double.parseDouble(parts[2].trim()),
                            Double.parseDouble(parts[3].trim())
                    ));
                    System.out.println("Travel expense added!");
                }
                case 3 -> {
                    System.out.print("Enter ID,Title,Amount,GST: ");
                    String[] parts = sc.nextLine().split(",");
                    manager.addExpense(new EntertainmentExpense(
                            Integer.parseInt(parts[0].trim()),
                            parts[1].trim(),
                            Double.parseDouble(parts[2].trim()),
                            Double.parseDouble(parts[3].trim())
                    ));
                    System.out.println("Entertainment expense added!");
                }
                case 4 -> {
                    System.out.print("Enter ID,Title,Amount,GST: ");
                    String[] parts = sc.nextLine().split(",");
                    manager.addExpense(new ShoppingExpense(
                            Integer.parseInt(parts[0].trim()),
                            parts[1].trim(),
                            Double.parseDouble(parts[2].trim()),
                            Double.parseDouble(parts[3].trim())
                    ));
                    System.out.println("Shopping expense added!");
                }
                case 5 -> manager.showAllExpenses();
                case 6 -> System.out.println("Total Expense: " + manager.getTotalExpense());
                case 7 -> {
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

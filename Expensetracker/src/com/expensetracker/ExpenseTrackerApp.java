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
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Title, Amount, GST: ");
                    manager.addExpense(new FoodExpense(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble()));
                    break;
                case 2:
                    System.out.print("Enter ID, Title, Amount, Distance: ");
                    manager.addExpense(new TravelExpense(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble()));
                    break;
                case 3:
                    System.out.print("Enter ID, Title, Amount, Ticket Charge: ");
                    manager.addExpense(new EntertainmentExpense(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble()));
                    break;
                case 4:
                    System.out.print("Enter ID, Title, Amount, Discount: ");
                    manager.addExpense(new ShoppingExpense(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble()));
                    break;
                case 5:
                    manager.showAllExpenses();
                    break;
                case 6:
                    System.out.println("Total Expenses: " + manager.calculateTotal());
                    break;
                case 7:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

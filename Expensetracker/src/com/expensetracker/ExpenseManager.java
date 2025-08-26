package com.expensetracker;

import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense e) {
        expenses.add(e);
    }

    public void showAllExpenses() {
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.calculateExpense();
        }
        return total;
    }
}

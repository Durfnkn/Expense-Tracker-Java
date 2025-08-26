package com.expensetracker;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager
{
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense)
    {
        expenses.add(expense);
    }

    public void showAllExpenses()
    {
        if (expenses.isEmpty()) 
        {
            System.out.println("No expenses recorded yet!");
            return;
        }
        for (Expense exp : expenses)
        {
            System.out.println(exp);
        }
    }

    public double calculateTotal()
    {
        double total = 0;
        for (Expense exp : expenses)
        {
            total += exp.calculateExpense();
        }
        return total;
    }
}

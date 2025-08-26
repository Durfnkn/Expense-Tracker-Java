package com.expensetracker;

public abstract class Expense {
    protected int expenseId;
    protected String title;
    protected double amount;

    public Expense(int expenseId, String title, double amount) {
        this.expenseId = expenseId;
        this.title = title;
        this.amount = amount;
    }

    public abstract double calculateExpense();

    @Override
    public String toString() {
        return expenseId + " | " + title + " | Base: " + amount;
    }
}

package com.expensetracker;

public abstract class Expense {
    protected int expenseId;
    protected String title;
    protected double amount;

    public Expense(int expenseId, String title, double amount)
    {
        if (expenseId <= 0) throw new IllegalArgumentException("ID must be positive!");
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative!");
        this.expenseId = expenseId;
        this.title = title;
        this.amount = amount;
    }

    public abstract double calculateExpense();

    public int getExpenseId() { return expenseId; }
    public String getTitle() { return title; }
    public double getAmount() { return amount; }

    @Override
    public String toString() 
    {
        return String.format("Expense[id=%d, title=%s, amount=%.2f]", expenseId, title, amount);
    }
}

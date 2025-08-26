package com.expensetracker;

public class TravelExpense extends Expense {
    private double distance;

    public TravelExpense(int expenseId, String title, double amount, double distance) {
        super(expenseId, title, amount);
        if (distance < 0) throw new IllegalArgumentException("Distance cannot be negative!");
        this.distance = distance;
    }

    @Override
    public double calculateExpense() {
        return amount + (distance * 2);
    }

    @Override
    public String toString() {
        return String.format("TravelExpense[id=%d, title=%s, base=%.2f, distance=%.2f, total=%.2f]",
                expenseId, title, amount, distance, calculateExpense());
    }
}

package com.expensetracker;

public class TravelExpense extends Expense {
    private double distanceCost;

    public TravelExpense(int expenseId, String title, double amount, double distanceCost) {
        super(expenseId, title, amount);
        if (distanceCost < 0) throw new IllegalArgumentException("Distance cost cannot be negative!");
        this.distanceCost = distanceCost;
    }

    @Override
    public double calculateExpense() {
        return amount + distanceCost;
    }

    @Override
    public String toString() {
        return String.format("TravelExpense[id=%d, title=%s, base=%.2f, distanceCost=%.2f, total=%.2f]",
                expenseId, title, amount, distanceCost, calculateExpense());
    }
}

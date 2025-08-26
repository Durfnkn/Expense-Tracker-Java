package com.expensetracker;

public class FoodExpense extends Expense {
    private double gst;

    public FoodExpense(int expenseId, String title, double amount, double gst) {
        super(expenseId, title, amount);
        if (gst < 0) throw new IllegalArgumentException("GST cannot be negative!");
        this.gst = gst;
    }

    @Override
    public double calculateExpense() {
        return amount + gst;
    }

    @Override
    public String toString() {
        return String.format("FoodExpense[id=%d, title=%s, base=%.2f, gst=%.2f, total=%.2f]",
                expenseId, title, amount, gst, calculateExpense());
    }
}

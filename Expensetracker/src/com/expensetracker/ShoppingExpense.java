package com.expensetracker;

public class ShoppingExpense extends Expense {
    private double discount;

    public ShoppingExpense(int expenseId, String title, double amount, double discount) {
        super(expenseId, title, amount);
        if (discount < 0) throw new IllegalArgumentException("Discount cannot be negative!");
        this.discount = discount;
    }

    @Override
    public double calculateExpense() {
        return amount - discount;
    }

    @Override
    public String toString() {
        return String.format("ShoppingExpense[id=%d, title=%s, base=%.2f, discount=%.2f, total=%.2f]",
                expenseId, title, amount, discount, calculateExpense());
    }
}

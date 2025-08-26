package com.expensetracker;

public class EntertainmentExpense extends Expense {
    private double ticketCharge;

    public EntertainmentExpense(int expenseId, String title, double amount, double ticketCharge) {
        super(expenseId, title, amount);
        if (ticketCharge < 0) throw new IllegalArgumentException("Ticket charge cannot be negative!");
        this.ticketCharge = ticketCharge;
    }

    @Override
    public double calculateExpense() {
        return amount + ticketCharge;
    }

    @Override
    public String toString() {
        return String.format("EntertainmentExpense[id=%d, title=%s, base=%.2f, ticket=%.2f, total=%.2f]",
                expenseId, title, amount, ticketCharge, calculateExpense());
    }
}

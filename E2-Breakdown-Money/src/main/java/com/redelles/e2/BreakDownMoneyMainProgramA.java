package com.redelles.e2;

import java.io.IOException;

/**
 * Input an amount of money and show us a breakdown of 500, 100, 50, 5, 1
 */
public class BreakDownMoneyMainProgramA {

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter an amount of money.");
        Integer amount = GetInteger.getOneInteger();

        Integer pendingAmount = GetBreakdown.breakdownWithQuantity(500, amount);
        System.out.println(pendingAmount + " -> " + 500);
        amount = amount - 500 * pendingAmount;

        pendingAmount = GetBreakdown.breakdownWithQuantity(100, amount);
        System.out.println(pendingAmount + " -> " + 100);
        amount = amount - 100 * pendingAmount;

        pendingAmount = GetBreakdown.breakdownWithQuantity(50, amount);
        System.out.println(pendingAmount + " -> " + 50);
        amount = amount - 50 * pendingAmount;

        pendingAmount = GetBreakdown.breakdownWithQuantity(5, amount);
        System.out.println(pendingAmount + " -> " + 5);
        amount = amount - 5 * pendingAmount;

        pendingAmount = GetBreakdown.breakdownWithQuantity(1, amount);
        System.out.println(pendingAmount + " -> " + 1);

    }
}

package com.redelles.e2;

import java.io.IOException;

/**
 * Input an amount of money and show us a breakdown of 500, 100, 50, 5, 1
 */
public class BreakDownMoneyMainProgramA {

    public static void main(String[] args) throws IOException {

        Integer amount = Numbers.getAmount();

        Integer pendingAmount = Breakdown.breakdownWithQuantity(500, amount);

        pendingAmount = Breakdown.breakdownWithQuantity(100, pendingAmount);

        pendingAmount = Breakdown.breakdownWithQuantity(50, pendingAmount);

        pendingAmount = Breakdown.breakdownWithQuantity(5, pendingAmount);

        Breakdown.breakdownWithQuantity(1, pendingAmount);

    }
}

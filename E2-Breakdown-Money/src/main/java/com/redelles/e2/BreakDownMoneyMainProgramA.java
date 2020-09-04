package com.redelles.e2;

import java.io.IOException;

/**
 * Input an amount of money and show us a breakdown of 500, 100, 50, 5, 1
 */
public class BreakDownMoneyMainProgramA {

    public static void main(String[] args) throws IOException {

        Integer amount = Utils.getAmount();

        Integer pendingAmount = Utils.breakdown(500, amount);

        pendingAmount = Utils.breakdown(100, pendingAmount);

        pendingAmount = Utils.breakdown(50, pendingAmount);

        pendingAmount = Utils.breakdown(5, pendingAmount);

        Utils.breakdown(1, pendingAmount);

    }
}

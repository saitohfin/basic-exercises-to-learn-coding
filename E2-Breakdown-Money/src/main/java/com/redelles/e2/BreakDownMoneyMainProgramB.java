package com.redelles.e2;

import java.io.IOException;

/**
 * Input an amount of money. Input a quantity. Show only the breakdown of the quantity input.
 */
public class BreakDownMoneyMainProgramB {

    public static void main(String[] args) throws IOException {

        Integer amount = Utils.getAmount();

        Integer quantity = Utils.getQty();

        Utils.breakdown(quantity, amount);

    }
}

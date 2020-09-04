package com.redelles.e2;

import java.io.IOException;

/**
 * Input an amount of money. Input three quantities and do the breakdown with these quantities with the money input
 */
public class BreakDownMoneyMainProgramD {

    public static void main(String[] args) throws IOException {
        /**
         * You can use to work with collections.
         * List<Integer> x = new ArrayList<>();
         * x.add()
         * x.get(position)
         */

        Integer amount = Utils.getAmount();
        Integer[] quantities = new Integer[3];
        quantities = Utils.getArrayOfThree();
        Integer pendingAmount = Utils.breakdown(quantities[0], amount);
        pendingAmount = Utils.breakdown(quantities[1], pendingAmount);
        Utils.breakdown(quantities[2], pendingAmount);
    }
}

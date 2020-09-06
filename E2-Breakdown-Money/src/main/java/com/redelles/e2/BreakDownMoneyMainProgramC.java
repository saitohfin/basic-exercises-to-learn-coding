package com.redelles.e2;

import java.io.IOException;

/**
 * Input an amount of money. Input three quantities and do the breakdown with these quantities with the money input
 */
public class BreakDownMoneyMainProgramC {

    public static void main(String[] args) throws IOException {
        /**
         * You can use to work with collections.
         * List<Integer> x = new ArrayList<>();
         * x.add()
         * x.get(position)
         */

        System.out.println("Please enter an amount of money.");
        Integer amount = GetNumbers.getInteger();
        Integer[] quantities = GetNumbers.getArrayOfThree();
        Integer firstQuantity = GetBreakdown.breakdownWithQuantity(quantities[0], amount);
        Integer pendingAmount = amount - quantities[0] * firstQuantity;
        Integer secondQuantity = GetBreakdown.breakdownWithQuantity(quantities[1], pendingAmount);
        pendingAmount = pendingAmount - quantities[1] * secondQuantity;
        Integer thirdQuantity = GetBreakdown.breakdownWithQuantity(quantities[2], pendingAmount);

        System.out.println(firstQuantity + " -> " + quantities[0]);
        System.out.println(secondQuantity + " -> " + quantities[1]);
        System.out.println(thirdQuantity + " -> " + quantities[2]);
    }
}

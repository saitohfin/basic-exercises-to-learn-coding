package com.redelles.e2;

import java.io.IOException;

/**
 * Input an amount of money. Input a quantity. Show only the breakdown of the quantity input.
 */
public class BreakDownMoneyMainProgramB {

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter an amount of money.");
        Integer amount = GetInteger.getOneInteger();
        System.out.println("Please enter a quantity.");
        Integer quantity = GetInteger.getOneInteger();

        Integer result = GetBreakdown.breakdownWithQuantity(quantity, amount);
        System.out.println(result + " -> " + quantity);

    }
}

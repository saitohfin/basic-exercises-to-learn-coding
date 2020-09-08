package com.redelles.e2;

import java.io.IOException;
import java.util.List;

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
        Integer amount = GetInteger.getOneInteger();
        List chosenArray = GetInteger.getArrayOfThreeIntegers();

        List breakdownResults = GetBreakdown.breakdownWithArrayQuantities(chosenArray,amount);

        for (Integer i = 0; i < breakdownResults.size(); i++){
            System.out.println(breakdownResults.get(i) + " -> " + chosenArray.get(i));
        }
    }
}

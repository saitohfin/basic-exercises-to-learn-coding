package com.redelles.e2;

import java.io.IOException;

/**
 * Input an amount of money and show us a breakdown of 500, 100, 50, 5, 1
 */
public class BreakDownMoneyMainProgramA {

    public static void main(String[] args) throws IOException {

        Integer amount = -1;

        do{
            try {
                System.out.println("Please enter an amount of money.");
                amount = Utils.getNumber();
            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
            }
        } while (!(amount instanceof Integer));

        Integer breakdown500;
        Integer breakdown100;
        Integer breakdown50;
        Integer breakdown5;

        breakdown500 = amount / 500;
        System.out.println(breakdown500 + " -> 500");
        amount -= 500*breakdown500;

        //Utils.breakdown(500, amount);
        //amount -= 100*breakdown100;
        //System.out.println(amount);

        breakdown100 = amount / 100;
        System.out.println(breakdown100 + " -> 100");
        amount -= 100*breakdown100;

        breakdown50 = amount / 50;
        System.out.println(breakdown50 + " -> 50");
        amount -= 50*breakdown50;

        breakdown5 = amount / 5;
        System.out.println(breakdown5 + " -> 5");
        amount -= 5*breakdown5;

        System.out.println(amount + " -> 1");
    }
}

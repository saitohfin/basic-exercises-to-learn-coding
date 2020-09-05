package com.redelles.e2;

import java.util.Scanner;

public class Numbers {

    public static Integer scanNumber(){

        Integer numberInput = -1;

        do {
            try {

                Scanner scan = new Scanner(System.in);
                numberInput = scan.nextInt();

            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
            }
        }while( numberInput == -1);

        return numberInput;
    }

    public static Integer getAmount(){

        Integer amount = -1;

        do{
            try {
                System.out.println("Please enter an amount of money.");
                amount = Numbers.scanNumber();

            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
            }

        } while (amount == -1);

        return amount;
    }

    public static Integer getQty(){

        Integer qty = -1;

        do{
            try {
                System.out.println("Please enter a quantity.");
                qty = Numbers.scanNumber();

            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");

            }

        } while (qty == -1);

        return qty;
    }

    public static Integer[] getArrayOfThree(){

        Integer[] quantities = new Integer[3];

        System.out.println("Please introduce the first quantity to do the breakdown, press enter.");
        quantities[0] = Numbers.scanNumber();
        System.out.println("Please introduce the second quantity to do the breakdown, press enter.");
        quantities[1] = Numbers.scanNumber();
        System.out.println("Please introduce the third quantity to do the breakdown, press enter.");
        quantities[2] = Numbers.scanNumber();

        return quantities;
    }

}

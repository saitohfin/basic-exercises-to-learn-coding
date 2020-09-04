package com.redelles.e2;

import java.util.Scanner;

public class Utils {

    public static Integer getAmount(){

        Integer amount = -1;
        Boolean flag;

        do{
            try {
                System.out.println("Please enter an amount of money.");
                amount = Utils.scanNumber();
                flag = false;
            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
                flag = true;
            }

        } while (flag);

        return amount;
    }

    public static Integer scanNumber(){

        Integer numberInput = 0;
        Scanner scan = new Scanner(System.in);
        numberInput = scan.nextInt();

        return numberInput;
    }

    public static Integer breakdown(Integer quantity, Integer result){

        Integer breakdownQty = result / quantity;
        System.out.println(breakdownQty + " -> " + quantity);
        return result = result - quantity * breakdownQty;
    }

    public static Integer getQty(){

        Integer qty = -1;
        Boolean flag;

        do{
            try {
                System.out.println("Please enter a quantity.");
                qty = Utils.scanNumber();
                flag = false;
            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
                flag = true;
            }

        } while (flag);

        return qty;
    }

    public static Integer[] getArrayOfThree(){
        System.out.println("Please introduce the first quantity to do the breakdown, press enter.");
        Integer[] quantities = new Integer[3];
        quantities[0] = Utils.scanNumber();
        System.out.println("Please introduce the second quantity to do the breakdown, press enter.");
        quantities[1] = Utils.scanNumber();
        System.out.println("Please introduce the third quantity to do the breakdown, press enter.");
        quantities[2] = Utils.scanNumber();

        return quantities;
    }
}

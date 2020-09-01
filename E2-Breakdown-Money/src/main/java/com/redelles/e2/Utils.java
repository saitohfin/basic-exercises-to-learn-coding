package com.redelles.e2;

import java.util.Scanner;

public class Utils {

    public static Integer getNumber(){
        Integer numberInput = 0;
        Scanner scan = new Scanner(System.in);

        numberInput = scan.nextInt();

        return numberInput;
    }

    public static Integer breakdown(Integer qty, Integer result){


        Integer breakdownQty = result / qty;
        System.out.println(breakdownQty + " -> " + qty);
        return result = result - qty * breakdownQty;
    }
}

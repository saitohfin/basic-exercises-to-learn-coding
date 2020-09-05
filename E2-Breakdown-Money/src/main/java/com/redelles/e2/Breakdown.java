package com.redelles.e2;



public class Breakdown {

    public static Integer breakdownWithQuantity(Integer quantity, Integer result){

        Integer breakdownQty = result / quantity;
        System.out.println(breakdownQty + " -> " + quantity);
        return result = result - quantity * breakdownQty;
    }


}

package com.redelles.e2;



import java.util.ArrayList;
import java.util.List;

public class GetBreakdown {

    public static Integer breakdownWithQuantity(Integer quantity, Integer amount){

        Integer breakdownQty = amount / quantity;

        return breakdownQty;
    }

    public static List breakdownWithArrayQuantities(List arrayOfQuantities, Integer amount){

        Integer pendingAmount = amount;
        List breakdownResults = new ArrayList();

        for ( Integer i = 0; i < arrayOfQuantities.size(); i++){
            Integer totalAmount  = amount;
            Integer number = (Integer) arrayOfQuantities.get(i);


            if (totalAmount > pendingAmount){
                totalAmount = pendingAmount;
            };
            Integer result = breakdownWithQuantity(number, totalAmount);
            breakdownResults.add(result);
            pendingAmount = totalAmount - number * result;
        }

        return breakdownResults;
    }

}

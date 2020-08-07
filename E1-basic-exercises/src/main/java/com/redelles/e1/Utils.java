package com.redelles.e1;

public class Utils {

    public static void printOddNumbers(int i1, int i2){
        for (Integer index = i1; index <= i2; index++){
            if (Odd.isOdd(index)){
                 System.out.println(index);
            }
        }
    }

    public static void printPairNumbers(int i1, int i2){
        for (Integer index = i1; index <= i2; index++){
            if (Pair.isPair(index)){
                System.out.println(index);
            }
        }
    }
}

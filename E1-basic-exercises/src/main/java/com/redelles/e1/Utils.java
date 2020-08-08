package com.redelles.e1;

public class Utils {

    public static void printOddNumbers(int number1, int number2){
        for (Integer index = number1; index <= number2; index++){
            if (Odd.isOdd(index)){
                 System.out.println(index);
            }
        }
    }

    public static void printPairNumbers(int number1, int number2){
        for (Integer index = number1; index <= number2; index++){
            if (Pair.isPair(index)){
                System.out.println(index);
            }
        }
    }
}

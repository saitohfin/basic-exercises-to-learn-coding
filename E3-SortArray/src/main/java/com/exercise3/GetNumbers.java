package com.exercise3;

import java.util.Scanner;

public class GetNumbers {

    public static Double[] getRandomDoubleNumberFrom1To10() {

        Double[] arrayNumbers = new Double[5];
        arrayNumbers[0] = Math.floor(Math.random() * (10 - 1 + 1) + 1);
        arrayNumbers[1] = Math.floor(Math.random() * (10 - 1 + 1) + 1);
        arrayNumbers[2] = Math.floor(Math.random() * (10 - 1 + 1) + 1);
        arrayNumbers[3] = Math.floor(Math.random() * (10 - 1 + 1) + 1);
        arrayNumbers[4] = Math.floor(Math.random() * (10 - 1 + 1) + 1);

        return arrayNumbers;
    }

    public static Double[] GetSortedAscArray(Double[] arrayOfNumbers) {

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] > arrayOfNumbers[j]) {
                    Double temp = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = temp;
                }
            }
        }

        return arrayOfNumbers;
    }

    public static Double GetMaximumFromArray(Double[] arrayOfNumbers) {

        Double max = arrayOfNumbers[0];
        for (Integer i = 1; i < arrayOfNumbers.length; i++) {
            if (max < arrayOfNumbers[i]) {
                max = arrayOfNumbers[i];
            }
        }

        return max;
    }

    public static Double GetMinimumFromArray(Double[] arrayOfNumbers) {

        Double min = arrayOfNumbers[0];
        for (Integer i = 1; i < arrayOfNumbers.length; i++) {
            if (min > arrayOfNumbers[i]) {
                min = arrayOfNumbers[i];
            }
        }

        return min;
    }

}

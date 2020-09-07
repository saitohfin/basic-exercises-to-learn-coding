package com.exercise3;

import java.util.Scanner;

public class GetNumbers {

    public static Integer scanNumber() {

        Integer numberInput = -1;

        do {
            try {

                Scanner scan = new Scanner(System.in);
                numberInput = scan.nextInt();

            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
            }
        } while (numberInput == -1);

        return numberInput;
    }

    public static Integer getInteger() {

        Integer number = -1;

        do {
            try {

                number = GetNumbers.scanNumber();

            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
            }

        } while (number == -1);

        return number;
    }

    public static Integer[] getArrayOfThree() {

        Integer[] quantities = new Integer[3];

        System.out.println("Please introduce the first quantity to do the breakdown, press enter.");
        quantities[0] = GetNumbers.scanNumber();
        System.out.println("Please introduce the second quantity to do the breakdown, press enter.");
        quantities[1] = GetNumbers.scanNumber();
        System.out.println("Please introduce the third quantity to do the breakdown, press enter.");
        quantities[2] = GetNumbers.scanNumber();

        return quantities;
    }

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

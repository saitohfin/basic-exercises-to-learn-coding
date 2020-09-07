package com.exercise3;

import java.io.IOException;

public class ArrayExercise3 {

    public static void main (String[] args) throws IOException {
        Double[] arrayOfNumbers = GetNumbers.getRandomDoubleNumberFrom1To10();
        System.out.println("Random array:");
        for (Integer i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }

        arrayOfNumbers = GetNumbers.GetSortedAscArray(arrayOfNumbers);

        System.out.println("\n Array sorted in ascending order: ");
        for (Integer i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }

        Double max = GetNumbers.GetMaximumFromArray(arrayOfNumbers);
        Double min = GetNumbers.GetMinimumFromArray(arrayOfNumbers);
        System.out.println("\nMaximum number = "
            + max + " Minimum number = " + min);
    }
}

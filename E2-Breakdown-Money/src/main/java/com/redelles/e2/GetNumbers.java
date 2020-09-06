package com.redelles.e2;

import java.util.Scanner;

public class GetNumbers {

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

    public static Integer getInteger(){

        Integer number = -1;

        do{
            try {

                number = GetNumbers.scanNumber();

            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
            }

        } while (number == -1);

        return number;
    }

    public static Integer[] getArrayOfThree(){

        Integer[] quantities = new Integer[3];

        System.out.println("Please introduce the first quantity to do the breakdown, press enter.");
        quantities[0] = GetNumbers.scanNumber();
        System.out.println("Please introduce the second quantity to do the breakdown, press enter.");
        quantities[1] = GetNumbers.scanNumber();
        System.out.println("Please introduce the third quantity to do the breakdown, press enter.");
        quantities[2] = GetNumbers.scanNumber();

        return quantities;
    }

}

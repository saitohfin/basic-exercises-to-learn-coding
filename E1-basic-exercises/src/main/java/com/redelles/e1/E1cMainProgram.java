package com.redelles.e1;

import java.io.IOException;
import java.util.Scanner;

/**
 * E1c. Input from keyboard two numbers and show the odd numbers between them.
 */
public class E1cMainProgram {


    public static void main(String[] args) throws IOException {

        Integer number1 = -1;
        Integer number2 = -1;

        do {
            try {
                System.out.println("First number should be less than second, try again");
                number1 = Utils.getNumber();
                number2 = Utils.getNumber();
            } catch (Exception e) {
                System.out.println("Something went wrong, please try again.");

            }
        } while (number1 >= number2);

        Utils.printOddNumbers(number1, number2);
    }
}

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

        do{
            try {
                System.out.println("This application works with 2 number, remember that first number should be less than second");
                System.out.println("Introduce the first number");
                number1 = Utils.getNumber();
                System.out.println("Introduce the second number");
                number2 =  Utils.getNumber();
            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
            }
        } while (number1 >= number2);

        Utils.printOddNumbers(number1, number2);
    }
}

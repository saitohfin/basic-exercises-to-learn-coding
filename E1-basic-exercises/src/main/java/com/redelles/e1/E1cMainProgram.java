package com.redelles.e1;

import java.io.IOException;
import java.util.Scanner;

/**
 * E1c. Input from keyboard two numbers and show the odd numbers between them.
 */
public class E1cMainProgram {


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Integer number1;
        Integer number2;
        try{
            do {
                System.out.println("First number should be less than second, try again");
                System.out.println("Introduce the first number");
                number1 = scan.nextInt();
                System.out.println("Introduce the second number");
                number2 = scan.nextInt();
            } while(number1 >= number2);

            Utils.printOddNumbers(number1, number2);

        } catch( Exception e){
            
        }
    }
}

package com.redelles.e1;

import java.io.IOException;
import java.util.Scanner;

/**
 * E1d. Input from keyboard two numbers, also select if we want to show odd or the pair numbers
 */
public class E1dMainProgram {

    public static void main(String[] args) throws IOException {
        System.out.println("Introduce the first number:");
        Scanner scan1 = new Scanner(System.in);
        String n1 = scan1.next();
        //You should search in internet to see how to input numbers from keyboard.
        System.out.println("Introduce the second number:");
        Scanner scan2 = new Scanner(System.in);
        String n2 = scan2.next();

        System.out.println("For getting the odd numbers between both, introduce 1, for getting " +
                "the pair numbers between both, introduce 2:");
        Scanner scan3 = new Scanner(System.in);
        String switchInput = scan3.next();

        Integer number1 = Integer.parseInt(n1);
        Integer number2 = Integer.parseInt(n2);


        // Error control
        if(number1 >= number2){
            System.out.println("First number should be less than second, try again");
        } else {
            if(switchInput == "1"){
                for (Integer index = number1; index <= number2; index++){
                    if (index % 2 != 0){
                        Odd.isOdd(index);
                        System.out.println(index);
                    }
                }
            } else if(switchInput == "2") {
                for (Integer index = number1; index <= number2; index++){
                    if (index % 2 == 0){
                        System.out.println(index);
                    }
                }
            }
        }
    }
}

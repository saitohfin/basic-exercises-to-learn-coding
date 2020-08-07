package com.redelles.e1;

import java.io.IOException;
import java.util.Scanner;

/**
 * E1c. Input from keyboard two numbers and show the odd numbers between them.
 */
public class E1cMainProgram {

    public static void main(String[] args) throws IOException {
        System.out.println("Title");
        System.out.println("Introduce the first number");
        Scanner scan1 = new Scanner(System.in);
        String n1 = scan1.next();
        //You should search in internet to see how to input numbers from keyboard.
        System.out.println("Introduce the second number");
        Scanner scan2 = new Scanner(System.in);
        String n2 = scan2.next();

        Integer number1 = Integer.parseInt(n1);
        Integer number2 = Integer.parseInt(n2);
        // Error control
        if (number1 >= number2){
            System.out.println("First number should be less than second, try again");
            System.out.println("Introduce the first number");
            Scanner scan3 = new Scanner(System.in);
            String n3 = scan3.next();
            //You should search in internet to see how to input numbers from keyboard.
            System.out.println("Introduce the second number");
            Scanner scan4 = new Scanner(System.in);
            String n4 = scan4.next();

            Integer number3 = Integer.parseInt(n3);
            Integer number4 = Integer.parseInt(n4);

            for (Integer index=number3; index <= number4; index++){
                if (index % 2 != 0){
                    System.out.println(index);
                }
            }

        } else {
            for (Integer index=number1; index <= number2; index++){
                if (index % 2 != 0){
                    System.out.println(index);
                }
            }
        }
    }
}

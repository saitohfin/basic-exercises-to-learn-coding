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
        String m1 = scan3.next();

        Integer x1 = Integer.parseInt(n1);
        Integer x2 = Integer.parseInt(n2);
        Integer s1 = Integer.parseInt(m1);

        // Error control
        if(x1 >= x2){
            System.out.println("First number should be less than second, try again");
        } else {
            if(s1 == 1){
                for (Integer index=x1; index <= x2; index++){
                    if (index % 2 != 0){
                        System.out.println(index);
                    }
                }
            } else if(s1 == 2) {
                for (Integer index=x1; index <= x2; index++){
                    if (index % 2 == 0){
                        System.out.println(index);
                    }
                }
            }



        }

    }
}

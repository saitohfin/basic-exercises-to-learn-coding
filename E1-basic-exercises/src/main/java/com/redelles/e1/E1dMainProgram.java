package com.redelles.e1;

import java.io.IOException;
import java.util.Scanner;

/**
 * E1d. Input from keyboard two numbers, also select if we want to show odd or the pair numbers
 */
public class E1dMainProgram {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Integer number1 = -1;
        Integer number2 = -1;
        String switchInput;

        do{
            try {
                System.out.println("First number should be less than second, try again");
                number1 = Utils.getNumber();
                number2 =  Utils.getNumber();
            } catch (Exception e) {
                System.out.println("Something went wrong, please try again.");
            }
        } while (number1 >= number2);

        do {
            System.out.println("For getting the odd numbers between both, introduce 'Yes', for getting " +
                    "the pair numbers between both, introduce 'No':");
            switchInput = scan.next();
        } while(!switchInput.equals("Yes") && !switchInput.equals("No"));

        switch (switchInput){
            case "Yes":
                Utils.printOddNumbers(number1, number2);
                break;
            case "No":
                Utils.printPairNumbers(number1, number2);
        };
    }
}

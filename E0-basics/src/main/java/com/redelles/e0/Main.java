package com.redelles.e0;

import java.io.IOException;

public class Main {

    //This method will be executed when a program is executed.
    public static void main(String[] args) throws IOException {

        /**
         * final means that this variable only can be assigned a value once,
         * after this line you can't do var = "tomas"
         */
        final String text = "Hello";

        /**
         * Integer, Double for numbers
         * String for text
         */
        final Integer nine = 9;

        /**
         * System.out.println will write on console
         */
        System.out.println(text);

        /**
         * for create a loop, first the count, second the condition, and third an operation
         */
        for (Integer index = 1; index <= nine; index++) {
            System.out.println("Number: " + index);
        }

        System.out.println("Now with doubles");

        for (Double index = 1.0; index <= nine; index += 0.5) {
            /**
             * if, allow us to define a condition.
             */
            if (index == 2.0) {
                System.out.println("I am a two???");
                /**
                 * else if, put another condition after the if, if the first is not success try with that
                 */
            } else if (index == 3.0) {
                System.out.println("I am a three???");
                /**
                 * else is executed when the beloved conditions has not been executed
                 */
            } else {
                System.out.println("Number: " + index);
            }
        }
    }
}

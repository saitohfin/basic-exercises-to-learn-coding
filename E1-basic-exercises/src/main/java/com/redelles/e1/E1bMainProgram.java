package com.redelles.e1;

import java.io.IOException;

/**
 * E1b. Show in console the pair numbers between 10 to 101.
 */
public class E1bMainProgram {

    public static void main(String[] args) throws IOException {

        System.out.println("E1b. Pair numbers between 10 to 101");

        for (Integer index = 10; index <= 101; index++){
            if (Pair.isPair(index)){
                System.out.println(index);
            }
        }
    }
}

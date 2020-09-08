package com.redelles.e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetInteger {

    public static Integer getOneInteger(){

        Integer number = -1;

        do{
            try {
                Scanner scan = new Scanner(System.in);
                number = scan.nextInt();

            } catch (Exception e) {
                System.out.println("REMEMBER This application only works with numbers.");
            }

        } while (number == -1);

        return number;
    }

    public static List getArrayOfThreeIntegers(){

        List<Integer> quantities = new ArrayList<Integer>();

        System.out.println("Please introduce the first quantity to do the breakdown, press enter.");
        quantities.add(GetInteger.getOneInteger());
        System.out.println("Please introduce the second quantity to do the breakdown, press enter.");
        quantities.add(GetInteger.getOneInteger());
        System.out.println("Please introduce the third quantity to do the breakdown, press enter.");
        quantities.add(GetInteger.getOneInteger());

        return quantities;
    }

    public static List getArrayOfWithChosenElements(){

        List<Integer> x = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        String addQuantity = "initialValue";

        do {
            System.out.println("Please enter a quantity and press ENTER.");
            x.add(GetInteger.getOneInteger());
            System.out.println("Do you want to enter a new quantity? YES or NO");
            addQuantity = scan.nextLine();

            while(!"YES".equals(addQuantity) && !"NO".equals(addQuantity)){
                System.out.println("Do you want to enter a new quantity? YES or NO");
                addQuantity = scan.nextLine();
            }

        }while(addQuantity.equals("YES"));

        return x;
    }



}

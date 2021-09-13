/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.println( "How many people? " );
        String People = scan.nextLine();

        System.out.println( "How many pizzas do you have? " );
        String Pizza = scan.nextLine();

        System.out.println( "How many slices per pizza? " );
        String Slices = scan.nextLine();

        // Turning strings into integers
        int intPeople = Integer.parseInt(People);
        int intPizza = Integer.parseInt(Pizza);
        int intSlices = Integer.parseInt(Slices);

        // Calculations
        int totalSlices = intPizza * intSlices;
        int perSlices = totalSlices / intPeople;
        int remainder = totalSlices % intPeople;

        // Output
        System.out.println(People+ " people with "+Pizza+" pizzas ("+totalSlices+" slices)");
        System.out.println("Each person gets "+perSlices+" slices of pizza.");
        System.out.println("There are "+remainder+" leftover pieces.");
    }
}

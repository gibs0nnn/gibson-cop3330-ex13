package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Nathaniel Gibson
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //Take inputs
        System.out.print("What is the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("What is the rate as a percentage: ");
        double rate = scanner.nextDouble();
        System.out.print("What is the number of years: ");
        int years = scanner.nextInt();
        System.out.print("What is the number of times the interest is compounded per year: ");
        int comPerYear = scanner.nextInt();

        //Compute
        //Create the compound interest formula
        double ratePercent = rate / 100;
        double amount = Math.round(principal * Math.pow(1 + (ratePercent / comPerYear)
                , comPerYear * years) * 100.0) / 100.0;

        //Output
        System.out.println("$" + principal + " is invested at " + rate + "% for " + years + " years compounded "
         + comPerYear + " times per year is $" + amount);
    }
}

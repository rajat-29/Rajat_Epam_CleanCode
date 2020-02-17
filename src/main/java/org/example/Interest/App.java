package org.example.Interest;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double principalAmount,interestRate;
        int timePeriod;

        System.out.println("Enter your Principal Amount : ");
        principalAmount = sc.nextDouble();
        System.out.println("Enter rate : ");
        interestRate = sc.nextDouble();
        System.out.println("Enter time : ");
        timePeriod = sc.nextInt();

        calculateInterest Interest = new calculateInterest(principalAmount,interestRate,timePeriod);

        System.out.println("Simple Interest is : " + Interest.findSimpleInterest());
        System.out.println("Compound Interest is : " + Interest.findCompoundInterest());

    }
}
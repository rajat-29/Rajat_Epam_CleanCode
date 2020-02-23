package org.example.Interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public class App
{
    public static final Logger logger = (Logger) LogManager.getLogger();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double principalAmount,interestRate;
        int timePeriod;

        logger.info("Enter your Principal Amount :");
        principalAmount = sc.nextDouble();
        logger.info("Enter rate : ");
        interestRate = sc.nextDouble();
        logger.info("Enter time : ");
        timePeriod = sc.nextInt();

        calculateInterest Interest = new calculateInterest(principalAmount,interestRate,timePeriod);

        logger.info("Simple Interest is : " + Interest.findSimpleInterest() + "\n");
        logger.info("Compound Interest is : " + Interest.findCompoundInterest() + "\n");

    }
}
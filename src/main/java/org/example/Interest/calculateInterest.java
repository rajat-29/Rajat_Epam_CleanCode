package org.example.Interest;

public class calculateInterest
{
    private double principalAmount;
    private double interestRate;
    private int timePeriod;

    public calculateInterest(double principalAmount,double interestRate,int timePeriod)
    {
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.timePeriod = timePeriod;
    }

    public double findSimpleInterest()
    {
        double result = (principalAmount*interestRate*timePeriod)/100;
        return result;
    }

    public double findCompoundInterest()
    {
        double result = principalAmount*Math.pow(1+interestRate/100,timePeriod);
        return result;
    }
}
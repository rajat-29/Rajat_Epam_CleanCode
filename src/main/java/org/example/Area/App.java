package org.example.Area;

import java.util.Scanner;

public class App
{
    private static Scanner sc = new java.util.Scanner(System.in);

    public static void main( String[] args )
    {
        double houseArea;
        String materialType;
        boolean automationOrNot = false;

        System.out.println("Enter House Area : ");
        houseArea = sc.nextDouble();

        System.out.println("Enter House Material");
        materialType = chooseMaterialType();

        if(materialType.toLowerCase().equals(MaterialType.highStandardMaterials.toString().toLowerCase()))
        {
            System.out.println("Enter you want automation or not (true/false) : ");
            automationOrNot = sc.nextBoolean();
        }

        CalculateTotalCost totalCost = new CalculateTotalCost();

        try {
            double result = totalCost.getTotalCost(houseArea,materialType,automationOrNot);
            System.out.println("Total cost is : " +result);
        }
        catch (InvalidMaterialsOptions ex)
        {
            System.out.println(ex);
        }
    }

    private static String chooseMaterialType()
    {
        MaterialType[] materialTypes = MaterialType.values();
        for(MaterialType m : materialTypes)
        {
            System.out.println("Input '" + m + "' for " + m);
        }
        System.out.println("Enter your choice : ");
        String material = sc.next();

        return material;
    }
}

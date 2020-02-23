package org.example.Area;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    public static final Logger logger= LogManager.getLogger(App.class);

    private static Scanner sc = new java.util.Scanner(System.in);
    public static void main( String[] args )
    {

        double houseArea;
        String materialType;
        boolean automationOrNot = false;

        logger.info("Enter House Area :");
        houseArea = sc.nextDouble();

        logger.info("Enter House Material :");
        materialType = chooseMaterialType();

        if(materialType.toLowerCase().equals(MaterialType.highStandardMaterials.toString().toLowerCase()))
        {
            logger.info("Enter you want automation or not (true/false) : ");
            automationOrNot = sc.nextBoolean();
        }

        CalculateTotalCost totalCost = new CalculateTotalCost();

        try {
            double result = totalCost.getTotalCost(houseArea,materialType,automationOrNot);
            logger.info("Total cost is : " +result);
        }
        catch (InvalidMaterialsOptions ex)
        {
            logger.info(ex);
        }
    }

    private static String chooseMaterialType()
    {
        MaterialType[] materialTypes = MaterialType.values();
        for(MaterialType m : materialTypes)
        {
            logger.info("Input '" + m + "' for " + m);
        }
        System.out.println("Enter your choice : ");
        String material = sc.next();

        return material;
    }
}

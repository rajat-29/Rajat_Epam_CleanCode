package org.example.Area;

class CalculateTotalCost
{
    private final double standardMaterialCost = 1200;
    private final double aboveStandardMaterialCost = 1500;
    private final double highMaterialCost = 1800;
    private final  double highMaterialCostAndAutomationCost = 2500;

    public double getTotalCost(double area,String material,boolean automationOrNot) throws InvalidMaterialsOptions
    {
        double materialWiseCost = checkMaterialOrdered(material,automationOrNot);

        double calculatedArea = area*materialWiseCost;
        return  calculatedArea;
    }

    private double checkMaterialOrdered(String material,boolean automationOrNot) throws InvalidMaterialsOptions {
        if(material.toLowerCase().equals(MaterialType.standardMaterials.toString().toLowerCase()))
        {
            return standardMaterialCost;
        }
        else if(material.toLowerCase().equals(MaterialType.aboveStandardMaterials.toString().toLowerCase()))
        {
            return aboveStandardMaterialCost;
        }
        else
        {
            boolean highMaterial = material.toLowerCase().equals(MaterialType.highStandardMaterials.toString().toLowerCase());
            if(highMaterial && !automationOrNot)
            {
                return highMaterialCost;
            }
            else if(highMaterial && automationOrNot)
            {
                return highMaterialCostAndAutomationCost;
            }
        }

        throw new InvalidMaterialsOptions();
    }
}
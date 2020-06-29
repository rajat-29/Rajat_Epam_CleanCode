import java.util.*;
import cost.ConstructionCost;
import interest.CompoundInterest;
import interest.SimpleInterest;

class Main {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter c for Construction Cost or i for Interest ");
        char ch=sc.next().charAt(0);

        switch(ch){

            case 'i':
                System.out.println("Enter SI for simple interest or CI for compound interest");

                switch (sc.next()){
                    case "SI":
                        System.out.println("Enter \"Principal Amount\" , \"Duration in Years\" and \"Rate of Interest\"...");
                        System.out.println(SimpleInterest.calculateInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                        break;

                    case "CI":
                        System.out.println("Enter \"Principal Amount\" , \"Duration in Years\" and \"Rate of Interest\"...");
                        System.out.println(CompoundInterest.calculateInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                        break;

                    default:
                        System.err.println("Wrong Input");
                }
            break;

            case 'c':
                
                String[] materials = ConstructionCost.getMaterials();
                
                for (int index = 0; index < materials.length; index++)
                    System.out.println("Enter " + (index + 1) + " to select " + materials[index]);

                byte selectMaterial = (byte) (sc.nextByte() - 1);
                
                System.out.println("Enter the Area of the house...");
                double area = sc.nextDouble();
                
                boolean requireAutomation = false;
                if(materials[selectMaterial].equals("High Standard Material"))
                {
                    System.out.println("Enter \"True\" if you need automation or else enter \"False\"...");
                    requireAutomation = sc.nextBoolean();
                }
                
                System.out.println(ConstructionCost.calculateCost(materials[selectMaterial], area, requireAutomation));
            break;
            
            default:
                System.err.println("Wrong Input");

        }
    }
}
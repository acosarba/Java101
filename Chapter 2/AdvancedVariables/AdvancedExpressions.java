
/**
 * Write a description of class AdvancedExpressions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdvancedExpressions
{
    public static void main(String[] args)
    {
        int cansPerPack= 6;
        final double CAN_VOLUME= 0.2212;
        double totalVolume= cansPerPack * CAN_VOLUME;
        
        System.out.print("total volume in a six pack of coke is ");
        System.out.print(totalVolume);
        System.out.println(" liters");
        
        cansPerPack= 8;
        System.out.print("total volume in a six pack of coke is ");
        System.out.print(totalVolume);
        System.out.println(" liters");
        
    }
}

       
    

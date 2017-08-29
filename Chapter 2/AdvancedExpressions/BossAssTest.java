
/**
 * Write a description of class BossAssTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BossAssTest
{

    public static void main(String[]args)
    {
        int cansPerPack= 6;
        final double CAN_VOLUME = .33;
        double totalVolume= cansPerPack * CAN_VOLUME;
        
        System.out.print("total volume in a " + cansPerPack + " pack of coke is ");
        System.out.print(totalVolume);
        System.out.println(" liters");
        
        cansPerPack= 8;
        totalVolume= cansPerPack * CAN_VOLUME;
        System.out.print("total volume in a " + cansPerPack + " pack of coke is " + totalVolume + );
        System.out.print(cansPerPack );
        System.out.print(" pack of coke is ");
        System.out.print(totalVolume);
        System.out.println(" liters");
        
        
        
    }
}

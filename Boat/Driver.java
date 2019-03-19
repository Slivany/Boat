
/**
 * Lav en beskrivelse af klassen Driver her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Driver
{
    public static void exam()
    {
        System.out.println("");
        Boat b1 = new Boat("Maria", 400000, false);
        Boat b2 = new Boat("Speedy", 20000, true);
        Boat b3 = new Boat("Jenny", 1000000, true);
        Boat b4 = new Boat("Fairy", 50000, false);
        Boat b5 = new Boat("Slowpoke", 5000, true);
        
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        System.out.println(b5.toString());
        
        System.out.println("");
        Marina m = new Marina("East Marina");
        m.add(b1);
        m.add(b2);
        m.add(b3);
        m.add(b4);
        m.add(b5);
        
        System.out.println("");
        System.out.println("Find all boats that are for sale and cheaper than two million:");
        System.out.println(m.cheaperThanAndForSale(2000000));
        
        System.out.println("");
        System.out.println("Find the most valuable boat:");
        System.out.println(m.mostValuable());
        
        System.out.println("");
        m.printBoats();
    }
}

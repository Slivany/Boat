import java.util.*;

/**
 * Lav en beskrivelse af klassen Marina her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Marina
{
    private String name;
    private ArrayList<Boat> boats;
    
    public Marina(String name)
    {
        this.name = name;
        boats = new ArrayList<Boat>();
    }
    
    public void add(Boat b)
    {
        boats.add(b);
    }
    
    public ArrayList<Boat> cheaperThanAndForSale(int t)
    {
        ArrayList<Boat> res = new ArrayList<Boat>();
        for(Boat b : boats)
        {
            if(b.getPrice() < t && b.checkSale() == true)
            {
                res.add(b);
            }
        }
        return res;
    }
    
    public Boat mostValuable()
    {
        Boat priciest = null;
        for(Boat b : boats)
        {
            if(priciest == null || priciest.getPrice() < b.getPrice())
            {
                priciest = b;
            }
        }
        return priciest;
    }
    
    public void printBoats()
    {
        System.out.println(name);
        
        Collections.sort(boats);
        
        for(Boat b : boats)
        {
            System.out.println(b);
        }
    }
}

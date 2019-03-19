
/**
 * Lav en beskrivelse af klassen Boat her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Boat implements Comparable<Boat>
{
    private String name;
    private int value;
    private boolean forSale;

    /**
     * Konstruktør for objekter af klassen Boat
     */
    public Boat(String name, int value, boolean forSale)
    {
        this.name = name;
        this.value = value;
        this.forSale = forSale;
    }
    
    public String toString()
    {
        String ref = name + ": " + value + " kr., ";
        if(forSale)
        {
            return ref + "for sale";
        }
        else
        {
            return ref + "not for sale";
        }
    }
    
    public int getPrice()
    {
        return value;
    }
    
    public boolean checkSale()
    {
        return forSale;
    }
    
    public int compareTo(Boat other)
    {
        if(value != other.value)
        {
            return other.value - value;
        }
        return name.compareTo(other.name);
    }
}

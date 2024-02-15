/**
A coin with a monetary value.
 */
public class Coin implements Comparable<Coin>
{
    private double value;
    private String name;

    /**
    Constructs a coin.
    @param aValue the monetary value of the coin
    @param aName the name of the coin
     */
    public Coin(double aValue, String aName) 
    { 
        value = aValue; 
        name = aName;
    }

    /**
    Gets the coin value.
    @return the value
     */
    public double getValue() 
    {
        return value;
    }

    /**
    Gets the coin name.
    @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
    Returns a description of this Coin.
    @return a description of this Coin.
     */
    public String toString()
    {
        return "name: " + this.name + "; value: " + this.value;
    }
    
    @Override
    public int compareTo(Coin other)
    {
        if(this.value > other.value)
        {
            return 1;  // could be 77
        }
        else if (this.value < other.value)
        {
            return -1; // could have been -444
        }
        else
        {
            return 0;
        }
        
    }
}

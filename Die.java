
/**
 * Rolls a die
 *
 * @author Andrew Thein
 * @version 2020-2-02
 */
public class Die
{
    int roll;
    
    /**
     * Creates an empty constructor
     */
    public Die()
    {
        this.roll = -1;
    }
    
    
    /**
     * Rolls the die
     * 
     * @return the result of the rull
     */
    public int roll()
    {
        roll = (int) ((Math.random() * 6) + 1);
        return roll;
    }
    
}


/**
 * Plays the game encorporating the rules
 *
 * @author Andrew Thein
 * @version 2021-2-04
 */
import java.util.Scanner;
public class Game
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        
        
        int total = d1.roll() + d2.roll();
        if (total == 7 || total == 11)
        {
            // won the game
        }
        else if (total == 2 || total == 3 || total == 12)
        {
            // lost the game
        }
        
        else //haven't won or lost game
        {
            int point = total;
            total = d1.roll() + d2.roll();
            while (total != 7 && total != point)
            {
                // haven't won or lost yet
                total = d1.roll() + d2.roll();
            }
            
            if (total == point)
            {
                // won game
            }
            
            else 
            {
                // lost game
            }
        }
    }
}

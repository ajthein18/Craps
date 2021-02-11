
/**
 * Plays the game encorporating the rules
 *
 * @author Andrew Thein
 * @version 2021-2-04
 */
import java.util.Scanner;
public class Game
{
    public static void play()
    {
        Die d1 = new Die();
        Die d2 = new Die();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Press [enter] to roll the dice");
        in.nextLine(); // waits for user to press enter
        int total = d1.roll() + d2.roll();
        System.out.print("You rolled a " + total + ". ");
        if (total == 7 || total == 11)
        {
            // wins game
            System.out.println( "You win!");
        }
        else if (total == 2 || total == 3 || total == 12)
        {
            // lost the game
            System.out.println("Sadly, you lose :(");
        }
        
        else //haven't won or lost game
        {
            int point = total;
            System.out.println(point + " is your point. Press [enter] to roll again.");
            in.nextLine(); // waits for user to press enter
            total = d1.roll() + d2.roll();
            while (total != 7 && total != point)
            {
                System.out.println("You rolled a " + total + ". Press [enter] to roll again.");
                in.nextLine(); // waits for user to press enter
                total = d1.roll() + d2.roll();
            }
            
            if (total == point)
            {
                System.out.println("You rolled your point. You win!");
            }
            
            else 
            {
                System.out.println("You rolled a 7. You lose :(");
            }
        }
    }
}

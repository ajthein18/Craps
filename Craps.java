/**
 * The craps class uses the rules in game class to play game
 *
 * @author Andrew Thein
 * @version 2020-2-04
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Would you like to play craps(y/n): ");
        String input = in.next();
        if (input.equalsIgnoreCase("y"))
        {
            System.out.println("Do you need to see the rules(y/n): "); // asks player if they need to see the rules
            String instructions = in.next();
            if (instructions.equalsIgnoreCase("y"))
            {
                System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2,3, or 12 automatically loses, and play is over. If a 4,5,6,8,9 or 10 are rolled on this first roll, that number becomes the point.");
                System.out.println("The player continues to roll the dice until they roll a 7 or their point. If you roll their point, you win. If they roll a 7, you lose");
            }
        }
        
        Game game = new Game();
        while (input.equalsIgnoreCase("y"))
        {
            game.play(); // calls the game class that has rules of game
            System.out.println("Would you like to play again(y/n): ");
            input = in.next();
            
        
        }
    }
}

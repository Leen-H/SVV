import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        String[] options = {"rock", "paper", "scissors"};
        String computer;
        String player;
        String playAgain = "yes";

        do
        {
            System.out.print("Enter your move (rock, paper, scissors): ");
            player = scanner.nextLine().toLowerCase();

            if (!player.equals("rock") && !player.equals("paper") && !player.equals("scissors"))
            {
                System.out.println("Invalid input");
            }

            computer = options[rnd.nextInt(3)];
            System.out.println("Computer's choice: " + computer);

            if (player.equals(computer))
            {
                System.out.println("It's a tie");
            }
            else if (player.equals("rock") && computer.equals("paper"))
            {
                System.out.println("Better luck next time");
            }
            else if (player.equals("rock") && computer.equals("scissors") || player.equals("paper") && computer.equals("rock") ||player.equals("scissors") && computer.equals("paper"))
            {
                System.out.println("You win!");
            }
            else
            {
                System.out.println("Better luck next time");
            }


            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();

        }
        while (playAgain.equals("yes"));
        System.out.println("Thanks for playing :)");
        scanner.close();

    }

}

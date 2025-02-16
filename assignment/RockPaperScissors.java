package assignment;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        String computerChoice = choices[rand.nextInt(3)];
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rock, paper, or scissors: ");
        String userChoice = scanner.next().toLowerCase();
        
        if (userChoice.equals(computerChoice)) {
            System.out.println("Draw!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Wins!");
        }
        
    }
}

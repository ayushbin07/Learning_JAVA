package Before_Sep_04;

import java.util.Scanner;
import java.util.Random;

public class newfile {
    public static void main(String[] args) {
        String[] rps = {"Rock" , "Paper" , "Scissor"};

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomIndex = rand.nextInt(3);
        String computerChoice = rps[randomIndex];

        System.out.println( "Make your choice player, s or p or r: ");
        String userInput = sc.nextLine();

        if (!userInput.equalsIgnoreCase("r") && !userInput.equalsIgnoreCase("p") && !userInput.equalsIgnoreCase("s")) {
            System.out.println("Invalid response player. Type either r or p or s ");
            return;
        }

        String userChoice = "";
        if (userInput.equalsIgnoreCase("r")) {
            userChoice = "rock";
        } else if (userInput.equalsIgnoreCase("p")) {
            userChoice = "paper";
        } else if (userInput.equalsIgnoreCase("s")) {
            userChoice = "scissor";
        }


        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a draw.");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissor")) || (userChoice.equalsIgnoreCase("Scissor") && computerChoice.equalsIgnoreCase("Paper") || (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))) ) {
            System.out.println("You Win Player.");
        } else {
            System.out.println("You lose.");
        }
        sc.close();
    }
}

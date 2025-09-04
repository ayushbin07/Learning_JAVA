import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LifeSucks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock, Papers and Scissors");
        System.out.println("This is going to be a game in terminal. \n You you will never play so I will be using R/r for rocks, P/p for papers and S/s for scissors. \n Ahh your tiny brain may think we have to type the whole R/r i mean either of this. \n Have fun playing. \n Either way you have no social life.  \n You pathetic low level creature.");
        String userChoice = scan.nextLine().toLowerCase();
        System.out.println("Great, You typed something. \n Hope It wont bring errors in this simple yet over commented code.");

        Random rand = new Random(); //Oh, C'mon don't judge me for the name.

        HashMap<String, Integer> map = new HashMap<>();
        map.put("s",0);
        map.put("p",1);
        map.put("r",2);

        String[] moves = {"Scissors", "Paper", "Rock"};


        int num = map.get(userChoice);
        int numComp = rand.nextInt(3);

        System.out.printf("Computer choosed %s%n", moves[numComp] );

        int scissorsPaperRockEngine = (num - numComp + 3 )%3;

        //Using Switch case
        switch (scissorsPaperRockEngine){
            case 0:
                System.out.println("It's a Tie. You are getting nowhere in life.");
                break;
            case 1:
                System.out.println("Computer wins. AI is Taking over. SUCH A PITY YOU ARE.");
                break;
            case 2:
                System.out.println("You win.\n Still she choose someone else over you.\n Tsk Tsk Tsk");
                break;
            default:
                System.out.println("You idiot bastard cannot you get the instructions right?");
        }
    }

}
import java.util.Random;
import java.util.Scanner;

public class SEP_03_Exerccise_of_OOP {
    private int number;
    private int noOfGuesses;
    private String user;

    //Constructor
    public SEP_03_Exerccise_of_OOP(int limit, String user){
        Random randy = new Random();
        number = randy.nextInt(limit) + 1;
        noOfGuesses = 0;
        this.user = user;
    }
    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println(user+", Enter the Number");
        int guess = sc.nextInt();
        noOfGuesses++;
        return guess;
    }
    public boolean ifCorrect(int guess){
        if(guess==number){
            System.out.println(user+", It is correct. You guessed in "+noOfGuesses+" guesses!");
            return true;
        } else if (guess > number){
            System.out.println(user+", Too high.");
        }else{
            System.out.println(user+", Too less.");
        }
        return false;
    }
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setUser(String n){
        this.user = n;
    }

    public static void main(String[] args) {

        System.out.println("Let's start guessing game.\n Enter the limit of number.\n Then your name.");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.nextLine();
        String user = sc.nextLine();


        SEP_03_Exerccise_of_OOP game = new SEP_03_Exerccise_of_OOP(limit,user);

        boolean wrong = false;

        while(!wrong){
            int guess = game.takeUserInput();
            wrong = game.ifCorrect(guess);
        }
    }
}
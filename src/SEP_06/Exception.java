package SEP_06;

//Exception = An event that interrupts the normal flow of a program.
//(Dividing by zero, file not found, mismatch input type) 1
//Surround any dangerous code with a try{} block
//try {}, catch{}, finally{}


import java.util.InputMismatchException;
import java.util.Scanner;

//like this
//try{
//            System.out.println(1/0);
//        }
//        catch (ArithmeticException e ){
//            System.out.println("Who divedes with zero??");
public class Exception {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in); <-- can also place here but have to close manually.
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
        }
        catch (ArithmeticException e ){
            System.out.println("Seriously?");
        }
        catch (InputMismatchException e){
            System.out.println("Type a number, Idiot");
        } catch (java.lang.Exception e) { //Safety net
            System.out.println("Something went wrong.");
        }
        finally {//used for cleanup. always executes
            //sc.close(); <-- No need since Scanner is in try block.
            System.out.println("This always executes.");
        }
    }
}

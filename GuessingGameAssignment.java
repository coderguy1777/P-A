import java.util.Scanner;
public class GuessingGameAssignment {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, welcome to the guessing game, please type your maximum number.");
        int maximum = scan.nextInt();
        System.out.println("You have typed" + " " + maximum + " " + "as the maximum of your range.");
        System.out.println("Now to begin, type the minimum number of your range.");
        int minimum = scan.nextInt();
        System.out.println("You have typed" + " " + minimum + " " + "as the minimum number of your range.");
        System.out.println("Now, to check, you have typed" + " " + maximum + "  " + "as your maximum of the range and typed" + " " + minimum + " " + "as the minimum of the range.");
        System.out.println("Type in yes or no if this is correct.");
        String correct = scan.next();
        if(correct.equals("yes")){
            System.out.println("Ok, lets get started.");
        }
        if(correct.equals("no")) {
            System.out.println("ok then, have a niceday, or simply start the program again for the correct numbers to be added.");
        }
        int guesses = 0;
        while(correct.equals("yes")) {
            scan = new Scanner(System.in);
            System.out.println("Now, for my first guess, is your number" + " " + maximum/2 + "?");
            System.out.println("ok dude, if your number is lower, type too low, if its higher type too high, and if its correct type correct.");
            int changer = (minimum+maximum)/2;
            String correctguess = scan.nextLine(); 
            guesses++;
            if(correctguess.equals("lower")) {
                System.out.println("Is the number your thinking of" + (changer + maximum)/2 + "?");    
            }
            else if(correctguess.equals("too high")) {
                System.out.print("Is the number your thinking of" + (changer + minimum)/2 + "?");
            }
            else if(correctguess.equals("correct")){
                System.out.println("ONE IN A MILLION KID" +(guesses)+ "TO GET THAT SHOT, I MEAN GUESS BUT YAHOOOOOOOOOOOOOOOOOOOOOOO!");
                break;
            }
            else{
                System.out.println("Sorry, what you have typed is not valid, try again with the inputs displayed earlier.");
            }
        }
    }
}









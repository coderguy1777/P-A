import java.util.Scanner;
public class guessingame {
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
        System.out.println("Now, for my first guess, is your number" + " " + maximum/2 + "?");
        System.out.println("for a higher output, type make it higher, then to make it lower type, make it lower.");
        System.out.println("Now if its correct, please type correct.");
        int guesses = 0;
        while(correct.equals("yes")) {
            System.out.println("Alright ladde, im gonna guess your number.");
            System.out.println("And won't give up till im done, or you say im wrong.");
            System.out.println("Alright, lets get started.");
            System.out.println("If I fail, senpai wont like me anymore :(");
            scan = new Scanner(System.in);
            String correctguess = scan.nextLine(); 
            int randomnumber = (minimum+maximum)/2;
            guesses++;
            if(correctguess.equals("make it higher")) {
                System.out.print("Is the number your thinking of" + " " + (randomnumber  + maximum)/2 + "?");
            }
            else if(correctguess.equals("make it lower")) {
                System.out.println("Is the number your thinking of" + " " + (randomnumber + minimum)/2 + "?");    
            }
            else if(correctguess.equals("correct")){
                System.out.println("ONE IN A MILLION KID," + " " +  (guesses) + " " + "TO GET THAT SHOT, I MEAN GUESS BUT YAHOOOOOOOOOOOOOOOOOOOOOOO!");
                break;
            }
            else if(correctguess.equals("incorrect")) {
                System.out.println("I am sorry I could not guess your number, I shall go kill myself because of this lmao.");
                break;
            }
            else{
                System.out.println("Ya dunce, thats not right on what you typed.");
            }
        }
    }
}
import java.io.*;
import java.util.Scanner;
public class ScanString {
    public static void main(String[]args) {
        myDice[] diceArray = new myDice[6];     // creates an array of 6 dice 

        Scanner myScan = new Scanner(System.in);    // creates a scanner 
        int n;
        System.out.println("Enter a number :  ");
        n= myScan.nextInt();

        for(int a=0;a<n;a++)     {

            for (int i = 0; i<diceArray.length; i++)
            {
                diceArray[i] = new myDice();        // fills each slot with dice 
            }

            for (int j=0; j<diceArray.length; j++)  //rolls 6 dice, prints each roll
            {

                diceArray[j].setRoll();
                int rollValue = diceArray[j].getRoll();         

                if (diceArray[0] == diceArray[1] &&
                diceArray[1] == diceArray[2] && 
                diceArray[3] == diceArray[4] && 
                diceArray[4] == diceArray[5])
                {
                    System.out.print(rollValue);                            
                }
                else{   System.out.print(rollValue);
                    n++; }
            }
            System.out.println("");
        }

    }
}

/*
 * A Program That plays connect four
 * By @Jordan Hill
 * This Program allows for connect four too be played by up to two players
 * Fun for friends and that one family member who has a weird accent
 * and may not even be Related to you and that homeless guy 
 * down from the theater school!
 */
import java.util.Scanner;

public class pandaconnect4project {
    // The First Parameter of this method checks if there is a winner from some of the other Private
    // Static methods and prints out a message if you've won or not.
    // The Second Parameter of this method asks each player for there input of a column
    // The Return Value from these parameters is the board stored and the incorrectness 
    // of a certain input if the user does that. 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] connectfourmainboard = new char[7][7];
        for (int pickle = 0; pickle < 7; ++pickle)
            for (int rick = 0; rick < 7; ++rick)
                connectfourmainboard[pickle][rick] = ' ';
        connectfourboard(connectfourmainboard);
        boolean turnRed = true;
        while (true) {
            if (turnRed)
                System.out.println("Player Red, Please make your move.");            
            else 
                System.out.println("Player yellow, please make your move.");
            System.out.print("Choose column (1-7) for a disk:");
            int column = input.nextInt();
            if (column < 1 || column > 7) {
                System.out.println("Column should be from 1 to 7");
                continue;
            }
            if (!putDisk(connectfourmainboard, column - 1, turnRed ? 'R' : 'Y')) {
                System.out.println("This column is filled! Choose another one.");
                continue;
            }
            connectfourboard(connectfourmainboard);
            char result = getPlayerWinner(connectfourmainboard);
            if (result == 'D') {
                System.out.println("Senpai would be upset since you got a draw, you should both be ashamed.");
                break;
            }
            else if (result == 'R') {
                System.out.println("Player Red has won the game and connected four!");
                break;
            }
            else if (result == 'Y') {
                System.out.println("Player Yellow has won the game and connected four!");
                break;
            }
            turnRed = !turnRed;
        }
    }
    // The First thing this method does is check the rows for the win check
    // the second Parameter this method has to check the columns in which each piece is for the win check
    // the return value of this method is the message from the main method
    // whether or not the certain player has successfully connected four through the rows and the pieces 
    // allign. 
    private static char rowincheck(char[][] board) {
        for (int row = 0; row < 7; ++row) {
            int count = 0;
            for (int column = 1; column < 7; ++column) {
                if (board[row][column] != ' ' &&
                board[row][column] == board[row][column-1])
                    ++count;
                else
                    count = 1;

                if (count >= 4) {
                    return board[row][column];
                }
            }
        }
        return ' ';
    }
    // The First parameter of this method is checking the rows for the column win check
    // The Second Parameter of this method is checking the columns and too see if there full and make the column
    // win check correct
    // the return value of this method is whether the columns are full and are correct and will allow the player to have connected four. 
    private static char columnwincheck(char[][] board) {
        for (int column = 0; column < 7; ++column) {
            int count = 0;
            for (int row = 1; row < 7; ++row) {
                if (board[row][column] != ' ' &&
                board[row][column] == board[row-1][column])
                    ++count;
                else
                    count = 1;
                if (count >= 4) {
                    return board[row][column];
                }
            }
        }
        return ' ';
    }
    // the first parameter of this method is checking the winner values and seeing if those spaces are filled
    // the second parameter of this method is determing the length and if there are four spaces filled allowing for connect four.
    // the return value of this method is determing which player won, Red or Yellow, it also checks if theres a draw between the two players
    // and prints the message out from the first method,  or the main method for most matters 
    public static char getPlayerWinner(char[][] board) {
        char winner = rowincheck(board);
        if (winner != ' ') return winner;
        winner = columnwincheck(board);

        if (winner != ' ') return winner;
        winner = diagonalwincheck(board);

        if (winner != ' ') return winner;

        for (int pickle2 = 0; pickle2 < board.length; ++pickle2)
            for (int rick2 = 0; rick2 < board[pickle2].length; ++rick2)
                if (board[pickle2][rick2] == ' ') return ' ';

        return 'D';
    }
    // The First Parameter of this method is determing if there is an open space for a piece
    // The Second Parameter of this method is determing of a space is empty, allowing for no placement of a piece 
    // the return value of this method is checking and then placing a piece in an empty space on the board 
    public static boolean putDisk(char[][] board, int column, char color) {
        if (board[0][column] != ' ')
            return false;
        for (int row = 0; row < 7; ++row) {
            if (board[row][column] != ' ') {
                board[row-1][column] = color;
                return true;
            }
        }
        board[6][column] = color;
        return true;
    }
    // The First Parameter of this method is checking for a diagonal win if four pieces are connected diagonally.
    // The Second Parameter of this method is checking for any wins that are a transversal diagonal.
    // the return value of this method is whether there are four pieces connected
    // diaganolly which will allow the player to have connected four. 
    private static char diagonalwincheck(char[][] board) {
        for (int column = 0; column < 7; ++column) {
            int count = 0;
            for (int row = 1; row < 7; ++row) {
                if (column + row >= 7) break;
                if (board[row][column+row] != ' ' &&
                board[row-1][column + row - 1] == board[row][column+row])
                    ++count;
                else
                    count = 1;
                if (count >= 4) return board[row][column+row];
            }
        }
        for (int row = 0; row < 7; ++row) {
            int count = 0;
            for (int column = 1; column < 7; ++column) {
                if (column + row >= 7) break;
                if (board[row + column][column] != ' ' &&
                board[row+column - 1][column - 1] == board[row + column][column])
                    ++count;
                else
                    count = 1;
                if (count >= 4) return board[row + column][column];
            }
        }
        for (int column = 0; column < 7; ++column) {
            int count = 0;
            for (int row = 1; row < 7; ++row) {
                if (column - row < 0) break;
                if (board[row][column-row] != ' ' &&
                board[row - 1][column - row + 1] == board[row][column-row])
                    ++count;
                else
                    count = 1;
                if (count >= 4) return board[row][column-row];
            }
        }
        for (int row = 0; row < 7; ++row) {
            int count = 0;
            for (int column = 5; column >= 0; --column) {
                if (column - row < 0) break;
                if (board[column - row][column] != ' ' &&
                board[column - row - 1][column + 1] == board[column - row][column])
                    ++count;
                else
                    count = 1;
                if (count >= 4) return board[column - row][column];
            }
        }
        return ' ';
    }
    // The First parameter of this method is printing out the column dividers for the board.
    // The Second Parameter of this method is printing out the bottom row of the board. 
    // the return value of this method is a fully printed out board. 
    public static void connectfourboard(char[][] board) {
        for (int row = 0; row < 7; ++row) {
            System.out.print("| ");
            for (int col = 0; col < 7; ++col)
                System.out.print(board[row][col] + "| ");
            System.out.println();
        }
        for (int col = 0; col < 7; ++col)
            System.out.print("---");
        System.out.println();
    }
}
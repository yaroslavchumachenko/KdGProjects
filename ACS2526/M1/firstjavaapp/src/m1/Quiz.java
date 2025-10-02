package m1;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int answer = 1024;
        int guess;
        boolean gameOver = false; // statement to get, if game is ended or not

        System.out.println("How many bytes in the kilobyte?");
        guess = keyboard.nextInt(); //getting an input from user

        while (!gameOver) {//cycle goes until gameOver are not "True"
            if (guess == answer){
                System.out.println("Right, you must be the ACS student!");
                gameOver = true; //if answer is correct, change the value of gameOver to "true" to end the game
            }
            else if (guess > answer){
                System.out.println(guess + " is too high!, try again!");
                guess = keyboard.nextInt(); // asking a user to write another value to get out from endless loop
            }
            else {
                System.out.println(guess + " is too low!, try again!");
                guess = keyboard.nextInt(); // asking a user to write another value to get out from endless loop
            }
        }


    }
}


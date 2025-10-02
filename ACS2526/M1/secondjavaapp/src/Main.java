
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double first_player = Math.random();
        double second_player = Math.random();
        int maxNumber = 3;
        int minNumber = 1;
        int pN;
        int gameState = 0;
        Scanner keyboard = new Scanner(System.in);
        int guess = 1;
        int matchesPile = 21;


        System.out.println("Hello, user! Let's play the Nimb game!");
        if(first_player <= second_player) {
            System.out.println("Your opponent is the first player!");
            pN = 1;
        }
        else {
            System.out.println("Your opponent is the second player!");
            pN = 2;
        }
        while (matchesPile > 1) {

            if  (first_player >= second_player) {
                System.out.println("Choose a number between 1 and " + maxNumber);
                guess = keyboard.nextInt();
                if (guess >= minNumber && guess <= maxNumber && matchesPile>1) {
                    matchesPile -= guess;
                    System.out.println("There is " + matchesPile + " matches left!");
                    gameState = 2;
                }
                else if (guess < minNumber && guess > maxNumber &&  matchesPile>1) {
                    System.out.println("your nuber should be from 1 to 3!");
                    System.out.println("Choose a number between 1 and " + maxNumber);
                    guess = keyboard.nextInt();
                }
                else{
                    gameState =1;
                }
                if ((matchesPile-1)%(maxNumber+1) == 0 && matchesPile>1) {
                    matchesPile -= 1;
                    System.out.println("Enemy took " + (matchesPile-1)%(maxNumber+1) + " match!");
                    System.out.println("There is " + matchesPile + " matches left!");
                    gameState = 1;


                }
                else if ((matchesPile-1)%(maxNumber+1) != 0 && matchesPile>1){
                    System.out.println("Your enemy took " + (matchesPile-1)%(maxNumber+1) + " match!");
                    matchesPile -= (matchesPile-1)%(maxNumber+1);
                    System.out.println("There is " + matchesPile + " matches left!");
                    gameState = 1;
                }
                else{
                    System.out.println("Game ends!");
                    gameState = 1;
                }
            }
            else{
                if ((matchesPile-1)%(maxNumber+1) ==0  && matchesPile>1) {
                    matchesPile -= 1;
                    System.out.println("Your enemy took 1 match!");
                    System.out.println("There is " + matchesPile + " matches left!");
                    if (guess >= minNumber && guess <= maxNumber && matchesPile>1) {
                        System.out.println("Choose a number between 1 and " + maxNumber);
                        guess = keyboard.nextInt();
                        gameState = 2;


                    }
                    else if (guess < minNumber || guess > maxNumber &&  matchesPile>1) {
                        System.out.println("your nuber should be from 1 to 3!");
                        System.out.println("Choose a number between 1 and " + maxNumber);
                        guess = keyboard.nextInt();
                    }
                    else{
                        gameState =1;
                    }
                }

                else if ((matchesPile-1)%(maxNumber+1) != 0 && matchesPile>1) {
                    System.out.println("Your enemy took " + (matchesPile-1)%(maxNumber+1) + " match!");
                    matchesPile -= (matchesPile-1)%(maxNumber+1);
                    if (guess >= minNumber && guess <= maxNumber && matchesPile>1) {
                        System.out.println("Choose a number between 1 and " + maxNumber);
                        guess = keyboard.nextInt();
                        gameState = 2;


                    }
                    else if (guess < minNumber && guess > maxNumber &&  matchesPile>1) {
                        System.out.println("your nuber should be from 1 to 3!");
                        System.out.println("Choose a number between 1 and " + maxNumber);
                        guess = keyboard.nextInt();
                    }
                    else{
                        gameState =1;
                    }
                }
                else{
                    System.out.println("Game ends!");
                    gameState = 1;
                }

            }

        }

        if (gameState == 2) {
            System.out.println("You win!");
        }
        else if (gameState == 1){
            System.out.println("You lose!");
        }


    }
}

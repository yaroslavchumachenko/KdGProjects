package Scrabble;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        String letter = keyboard.nextLine();
        int total =0;
        int lng = letter.length();
        char[] sentence = letter.toUpperCase().toCharArray();
        for (int i = 0; i < lng ; i++){
            switch (sentence[i]) {
                case 'A', 'E', 'I', 'L', 'O', 'U', 'N', 'S', 'T', 'R':
                        System.out.println("You get 1 point!");
                        total += 1;
                        break;
                case 'D', 'G':
                        System.out.println("You get 2 points!");
                        total += 2;
                        break;
                case 'B', 'C', 'M', 'P':
                        System.out.println("You get 3 points!");
                        total += 3;
                        break;
                case 'F', 'H', 'V', 'W', 'Y':
                        System.out.println("You get 4 points!");
                        total += 4;
                        break;
                case 'K':
                        System.out.println("You get 5 points!");
                        total += 5;
                        break;
                case 'J', 'X':
                        System.out.println("You get 8 points!");
                        total += 8;
                        break;
                case 'Q', 'Z':
                        System.out.println("You get 10 points!");
                        total += 10;
                        break;
                default: System.out.println("Invalid letter!"); break;
            }
        }
        System.out.println("Total is " + total);
        if (total <= 30){
            System.out.println("To low!");
        }

    }

}

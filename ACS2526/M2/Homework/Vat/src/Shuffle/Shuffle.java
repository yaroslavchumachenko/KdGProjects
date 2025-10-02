package Shuffle;

import java.util.Scanner;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {

        String name;
        String name2 = "";
        String shuffledName = "";




        Random rand = new Random();
        System.out.println(rand.nextInt(10));


        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        name2 = name;
        int nameLen = name.length();
        //char[] myArray = name.toCharArray();
        for (int i = 0; i <= nameLen; i++){
            if (name.length() == 0) {
                break;
            }
            else {
                int randnum = rand.nextInt(name.length());
                shuffledName = name.charAt(randnum) + shuffledName;
                char[] myNameChars = name.toCharArray();
                myNameChars[randnum] = ' ';
                name = String.valueOf(myNameChars);
                name = name.replaceAll("\\s+", "");

            }

        }
        System.out.println("Hi " + name2 + " your scrambled name is " + shuffledName);


    }
}

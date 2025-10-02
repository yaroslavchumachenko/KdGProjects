package Age;

import java.util.Scanner;

public class Age {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        int age;
        final int minAge = 0;
        System.out.println("Enter your age: ");
        age = keyboard.nextInt();
        if (age <= 2 && age >= minAge) {
            System.out.println("You are a Baby!");
        }
        else if (3 <= age && age <= 12){
            System.out.println("You are a Child!");
        }
        else if (13 <= age && age <= 17){
            System.out.println("You are a Teen!");
        }
        else if (age >= 18){
            System.out.println("You are an Adult!");
        }
        else{
            System.out.println("Invalid age!");
        }
        System.out.println("There is next age categories: \n Baby < 2 \n Child 2-12 \n Teenager 13-17 \n Adult 18+)");
    }
}

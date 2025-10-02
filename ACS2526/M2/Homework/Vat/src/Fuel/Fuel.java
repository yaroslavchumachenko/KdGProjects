package Fuel;

import java.util.Scanner;



/*Write a program to calculate a car's fuel consumption.

Ask for the following input:

The car's mileage the last time its tank was filled.
The current mileage of the car.
The amount of fuel (in liters) that was used to fill the tank.
Example
Enter the previous mileage: 79114
Enter the current mileage: 80103
Enter the amount of liters refilled: 60.4
Consumption for 989km driven: 6.11 liters/100km */

public class Fuel {
    public static void  main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int milageFilled;
        int milageCurrent;
        float refilled;
        float consumption;
        boolean status = true;

        System.out.println("Please provide the milage, when the tank was last filled: ");
        milageFilled = keyboard.nextInt();
        System.out.println("Please provide the current milage: ");
        milageCurrent = keyboard.nextInt();
        while (status) {
            if (milageCurrent <= milageFilled){
                System.out.println("Your current milage couldn't be lower, than previous value! Try again. ");
                milageCurrent = keyboard.nextInt();
            }
            else{
                System.out.println("How much fuel did you filled?");
                refilled = keyboard.nextFloat();
                consumption = refilled/((milageCurrent - milageFilled)/100);
                System.out.println("Consumption for " + (milageCurrent-milageFilled) + " km driven: " + consumption + " liters/100km ");
                status = false;
            }
        }

    }
}

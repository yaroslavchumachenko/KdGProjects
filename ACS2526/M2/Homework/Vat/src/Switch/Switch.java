package Switch;

import java.util.Arrays;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean firstSwitch;
        boolean secondSwitch;
        boolean thirdSwitch;
        int total = 0;

        System.out.println("Enter the state of the first switch(\"true\" or \"false\"): ");
        firstSwitch = keyboard.nextBoolean();
        System.out.println("Enter the state of the second switch(\"true\" or \"false\"): ");
        secondSwitch = keyboard.nextBoolean();
        System.out.println("Enter the state of the third switch(\"true\" or \"false\"): ");
        thirdSwitch = keyboard.nextBoolean();
        boolean[] result = {firstSwitch, secondSwitch, thirdSwitch};
        for (int i = 0; i < result.length; i++)
            if (result[i] == true){
                total++;
            }


        switch (total){
            case 0:
                System.out.println("At most one switch is turned on.");
                break;
            case 1:
                System.out.println("At most one switch is turned on.");
                break;
            case 2:
                System.out.println("At least two switches are turned on.\n" +
                        "Exactly two switches are turned on.");
                break;
            case 3:
                System.out.println("At least two switches are turned on.");
                break;
        }
    }
}

package Vat;

import java.util.Scanner;

public class Vat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float vatPers;
        float sum;
        int choose;
        boolean status = true;


        // sum*(1+(vatPers/100))

        System.out.println("Hi, user! Enter the sum in $: ");
        sum = keyboard.nextInt();
        System.out.println("Enter the VAT percentage: ");
        vatPers = keyboard.nextInt();
        System.out.println("Make a choice (1 = inclusive, 2 = exclusive)");
        choose = keyboard.nextInt();
        float res = (sum/(1+(vatPers/100)));
        while (status == true) {
            if (choose == 1) {
                System.out.println(res + " + " + vatPers + "% = " + sum );
                status = false;
            }
            else if (choose == 2) {
                System.out.println(sum + " + " + vatPers + "% = " + (sum + sum*vatPers/100));
                status = false;
            }
            else {
                System.out.println("Invalid choice, try again!");
                choose = keyboard.nextInt();
            }
        }

    }
}

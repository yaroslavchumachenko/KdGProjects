package m1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int first;
        int second;
        int sum;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number:");
        first = keyboard.nextInt();
        System.out.println("Enter the second number:");
        second = keyboard.nextInt();
        sum = first + second;
        System.out.println("The sum is: " + sum);


    }
}

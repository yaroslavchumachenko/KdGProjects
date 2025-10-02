package Numbers;

import java.util.Scanner;

public class Numbers1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int MINIMUM =100000;
        int MAXIMUM = 999999;
        int usernum1;
        int usernum2;
        long result;

        System.out.println("Hi, User! Write first 6 digits number!");
        usernum1 = keyboard.nextInt();
        if (usernum1 < MINIMUM || usernum1 > MAXIMUM) {
            System.out.println("Invalid input! Try again!");
        }
        System.out.println("Write second 6 digits number!");
        usernum2 = keyboard.nextInt();
        if (usernum2 < MINIMUM || usernum2 > MAXIMUM) {
            System.out.println("Invalid input! Try again!");
        }
        result = (usernum1 * usernum2)%100000;

        System.out.println("The last 5 digits of the result is: " + result);

    }
}

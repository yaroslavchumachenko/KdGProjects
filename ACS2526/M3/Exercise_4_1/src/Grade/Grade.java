package Grade;

import java.util.Scanner;

public class Grade {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);
        int grade;
        System.out.println("Enter the grade of a student: ");
        grade = keyboard.nextInt();
        System.out.println("Grade is " + grade);


    }
}

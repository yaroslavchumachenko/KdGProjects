package VAT;
/*1. Ask the user for the price of the first product.

2. Ask the user for the price of the second product.

3. Ask the user for the price of the third product.

4. Check: if a product price is negative, display an error message and set the price to 0.

5. Calculate the price including VAT for each product:

a. Example: use 21% VAT on each product.

b. Display the price including VAT each time.

6. Add up all prices (including VAT) and display the total price.

7. If the total price exceeds 100 euros, the customer receives a 10% discount.

8. Finally, display the final price (with or without discount).

9. If the total price is exactly 0, display: "No products purchased."

10. If the final price is more than 200 euros, display: "You will receive an extra gift!".*/

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class VAT {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int MIN = 1;
        double VAT = 0.21;
        double total = 0;
        double product;

        for(int i = 1; i<=3; i++){
            System.out.println("Enter the " + i + "th product price: ");
            product  = keyboard.nextDouble();
            if (product<MIN){
                System.out.println("Incorrect price");
                break;
            }
            total += product + product*VAT;
        }
        System.out.println("Total price: " + total);
        if (total >100 && total < 200) {
            System.out.println("Your total is more than 100! You received a discount!");
            System.out.println("Your total with discount is " + (total-(total*0.10)));
        }
        else if (total == 0){
            System.out.println("You haven't bought anything!");
        }
        else if (total > 200){
            System.out.println("You received an extra gift!");
        }
       /* if  (firstProd < MIN) {
            System.out.println("Invalid price!");
        }
        else{
            System.out.println("Price including VAT(21%) is: " + firstProd);
        }
        System.out.println("Enter the second product price: ");
        secondProd = keyboard.nextInt();
        secondProd += (secondProd*VAT);
        if (secondProd < MIN) {
            System.out.println("Invalid price!");
        }
        else{
            System.out.println("Price including VAT(21%) is: " + secondProd);
        }
        System.out.println("Enter the third product price: ");
        thirdProd = keyboard.nextInt();
        thirdProd += (thirdProd*VAT);
        if (thirdProd < MIN) {
            System.out.println("Invalid price!");
        }
        else{
            System.out.println("Price including VAT(21%) is: " + thirdProd);
        }

        total = firstProd + secondProd + thirdProd;
        System.out.println("You spend " + total + "in total!");
        if (total > 100) {
            System.out.println("Your total is more than 100! You received a discount!");
            System.out.println("Your total with discount is " + (total-(total*0.10)));
        }
        else if (total == 0){
            System.out.println("You haven't bought anything!");
        }
        else if (total > 200){
            System.out.println("You received an extra gift!");
        }*/











    }
}

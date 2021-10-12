/*
 * make change for a given total in cents
 * print out number of each coin (quarters, dimes, nickels, pennies)
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class MakeChange {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //get total number of cents from user:
        System.out.println("Enter total number of cents:");

        //TODO: get input
        int change = keyboard.nextInt();

        System.out.println("Exact change is:");
        //TODO: calculate and output number of each coin o make change for given input total
        //TODO: calculate and output total number of coins

        int quarters = change / 25;
        int remainder1 = change - (25 * quarters);
        int dimes = remainder1 / 10;
        int remainder2 = remainder1 - (10 * dimes);
        int nickels = remainder2 / 5;
        int remainder3 = remainder2 - (5 * nickels);
        int pennies = remainder3 / 1;

        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
        System.out.println("Total number of coins is: " + (quarters + dimes + nickels + pennies));

    }
}

package Exercise1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class: AdditionCalculator
 * Author: Dylan Long
 * Version: 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 *
 * This Java program continuously prompts the user to input two integers, calculates their sum, and displays it,
 * handling any input errors with an appropriate message until valid inputs are provided.
 * */

public class AdditionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //flag is set to true so the loop always starts
        boolean flag = true;

        while(flag) {
            try {
                System.out.println("Enter two integers and I will return the sum");
                System.out.print("Number 1: ");
                int num1 = scanner.nextInt();

                System.out.print("Number 2: ");
                int num2 = scanner.nextInt();

                int sum = num1 + num2;

                System.out.println("Sum: " + sum + " is the sum of " + num1 + " + " + num2);

                //here the flag is set to false because the program is able to reach this point without exception
                flag = false;
            }

            //if the user enters non-integer, exception is caught and the program skips to this block
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter two integers.\n");
                scanner.nextLine();
            }
        }
    }
}

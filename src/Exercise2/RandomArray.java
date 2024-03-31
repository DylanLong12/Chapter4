package Exercise2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Class: RandomArray
 * Author: Dylan Long
 * Version: 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 *
 * This Java program generates an array of 50 random double values between 0 and 100,
 * then continuously prompts the user to input an index within the range 0-49 to retrieve
 * and display the corresponding value from the array, handling any input errors or
 * index out-of-bounds exceptions with appropriate messages until a valid index is provided.
 * */

public class RandomArray {

    public static void main(String[] args) {
        //flag set to true to start the loop
        boolean flag = true;
        double[] array = new double[50];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //fills array with random doubles between 0 - 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 100;
        }

        while (flag) {
            try {
                System.out.println("Enter an index between 0 - 49 and I will return the value.");
                System.out.print("index: ");
                int index = scanner.nextInt();
                System.out.println(index + " ---> " + array[index]);
                flag = false;
            }
            //if user enters index out of bounds, the program skips to this block
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: please enter a valid index between 0 - 49\n");
                scanner.nextLine();
            }

            //if user enters a non-integer, the program skips to this block
            catch (InputMismatchException e) {
                System.out.println("Error: please enter a valid index between 0 - 49. MUST BE AN INTEGER\n");
                scanner.nextLine();
            }
        }
    }
}

package Exercise3;

/**
 * Class: TriangleTester
 * Author: Dylan Long
 * Version: 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 *
 * This program is used to test the triangle class
 * */

public class TriangleTester {

    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(3, 4, 5);
            System.out.println("Triangle1 is valid: " + triangle1.checkSides());

            Triangle triangle2 = new Triangle(7, 10, 5);
            System.out.println("Triangle2 is valid: " + triangle2.checkSides());

            //invalid sides for triangle
            Triangle triangle3 = new Triangle(1, 2, 3);
            System.out.println("Triangle3 is invalid: " + triangle3.checkSides());

        }
        //if the triangle is invalid, program skips to this block and the exception error is printed from triangle
        // class
        catch (IllegalTriangleSideException e) {
            System.out.println(e);
        }
    }
}

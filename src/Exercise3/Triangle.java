package Exercise3;

/**
 * Class: Triangle
 * Author: Dylan Long
 * Version: 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 *
 * This class checks if a triangle is valid or not depending on its sides.
 * */

public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean checkSides() throws IllegalTriangleSideException {
        // if the triangle is valid, returns true
        if (this.side1 + this.side2 > this.side3 && this.side2 + this.side3 > this.side1 &&
        this.side1 + this.side3 > this.side2) {
            return true;
        }

        //if triangle is not valid, throws exception
        throw new IllegalTriangleSideException("Error: the sides do not fit the criteria for a triangle");
    }
}

package edu.junior.shape;

/**
 * Author: eukovko
 * Date: 11/17/2020
 */
public class Rectangle {

    private static final String ILLEGAL_ARGUMENT_MESSAGE = "Side length cannot be negative";
    private float sideA;
    private float sideB;

    public Rectangle(float sideA, float sideB) {

        if (sideA < 0 || sideB < 0) {

            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_MESSAGE);
        }
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getPerimeter() {

        // TODO: Implement this method 
        throw new UnsupportedOperationException();
    }

    public float getArea() {

        // TODO: Implement this method 
        throw new UnsupportedOperationException();
    }

}

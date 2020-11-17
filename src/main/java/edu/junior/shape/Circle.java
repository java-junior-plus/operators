package edu.junior.shape;

/**
 * Author: eukovko
 * Date: 11/17/2020
 */
public class Circle {

    private static final String ILLEGAL_ARGUMENT_MESSAGE = "Radius cannot be negative";
    private float radius;

    public Circle(float radius) {

        if (radius < 0) {
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_MESSAGE);
        }

        this.radius = radius;
    }

    public float getRadius() {

        return radius;
    }

    public void setRadius(float radius) {

        this.radius = radius;
    }

    public float getCircumference() {

        // TODO: Implement this method 
        throw new UnsupportedOperationException();
    }

    public float getArea() {

        // TODO: Implement this method 
        throw new UnsupportedOperationException();
    }
}

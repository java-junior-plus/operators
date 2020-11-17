package edu.junior.shape;

/**
 * Author: eukovko
 * Date: 11/17/2020
 */
public class Triangle {

    private static final String ILLEGAL_NEGATIVE_ARGUMENT_MESSAGE = "Side length cannot be negative";
    private static final String ILLEGAL_TRIANGLE_SIDE_SUM_MESSAGE = "One side of the triangle is less then the sum of the others";
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC) {

        negativeSideCheck(sideA, sideB, sideC);
        triangleSideSumCheck(sideA, sideB, sideC);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    public float getPerimeter() {

        // TODO: Implement this method
        throw new UnsupportedOperationException();
    }

    public float getArea() {

        // TODO: Implement this method
        throw new UnsupportedOperationException();
    }

    private static void negativeSideCheck(float sideA, float sideB, float sideC) {

        if (sideA < 0 || sideB < 0 || sideC < 0) {

            throw new IllegalArgumentException(ILLEGAL_NEGATIVE_ARGUMENT_MESSAGE);
        }
    }

    private static void triangleSideSumCheck(float sideA, float sideB, float sideC) {

        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            throw new IllegalArgumentException(ILLEGAL_TRIANGLE_SIDE_SUM_MESSAGE);
        }
    }
}

package edu.junior.shape;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withinPercentage;

/**
 * Author: eukovko
 * Date: 11/17/2020
 */
class RectangleTest {

    @ParameterizedTest
    @ValueSource(floats = {13.2F, 0.5F})
    void testPerimeter(float sideA, float sideB){

        Rectangle rectangle = new Rectangle(sideA, sideB);
        float actual = rectangle.getPerimeter();
        float expected = (sideA + sideB) * 2;

        assertThat(actual).isCloseTo(expected, withinPercentage(5));
    }

    @ParameterizedTest
    @ValueSource(floats = {13.2F, 0.5F})
    void testArea(float sideA, float sideB){

        Rectangle rectangle = new Rectangle(sideA, sideB);
        float actual = rectangle.getArea();
        float expected = sideA * sideB;

        assertThat(actual).isCloseTo(expected, withinPercentage(5));
    }
}
package edu.junior.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withinPercentage;

/**
 * Author: eukovko
 * Date: 11/17/2020
 */
class CircleTest {


    @DisplayName("Circle circumference test")
    @ParameterizedTest(name = "Test #" + ParameterizedTest.INDEX_PLACEHOLDER)
    @ValueSource(floats = {0.3F, 0.0F, 123.0F, 14.0032F})
    void testCircleCircumference(float radius) {

        Circle circle = new Circle(radius);
        float actual = circle.getCircumference();
        float expected = (float) (2 * Math.PI * radius);

        assertThat(actual).isCloseTo(expected, withinPercentage(5));
    }

    @DisplayName("Circle area test")
    @ParameterizedTest(name = "Test #" + ParameterizedTest.INDEX_PLACEHOLDER)
    @ValueSource(floats = {0.3F, 0.0F, 123.0F, 14.0032F})
    void testCircleArea(float radius) {

        Circle circle = new Circle(radius);
        float actual = circle.getArea();
        float expected = (float)  (Math.PI * Math.pow(radius,2));

        assertThat(actual).isCloseTo(expected, withinPercentage(5));
    }
}
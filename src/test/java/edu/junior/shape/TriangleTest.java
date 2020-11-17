package edu.junior.shape;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withinPercentage;

/**
 * Author: eukovko
 * Date: 11/17/2020
 */
class TriangleTest {

    @ParameterizedTest
    @CsvSource({"2,3,5"})
    void testPerimeter(float sideA, float sideB, float sideC) {

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        float actual = triangle.getPerimeter();
        float expected = sideA + sideB + sideC;

        assertThat(actual).isCloseTo(expected, withinPercentage(5));
    }

    @ParameterizedTest
    @CsvSource({"2,3,5"})
    void testArea(float sideA, float sideB, float sideC) {

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        float actual = triangle.getPerimeter();

        float s = sideA + sideB + sideC;
        float expected = (float) Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

        assertThat(actual).isCloseTo(expected, withinPercentage(5));
    }
}
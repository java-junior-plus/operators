package edu.junior.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withinPercentage;

/**
 * Author: eukovko
 * Date: 11/17/2020
 */
class CalculatorTest {

    @DisplayName("Calculator addition test")
    @ParameterizedTest(name = "Test #" + ParameterizedTest.INDEX_PLACEHOLDER)
    @CsvSource({"4.0,2.3",
                "12.3,2.0"})
    void testAdd(float operandA, float operandB) {

        Calculator calculator = new Calculator();
        float actual = calculator.add(operandA, operandB);
        float expected = operandA + operandB;
        assertThat(actual).isCloseTo(expected, withinPercentage(1));
    }

    @DisplayName("Calculator subtraction test")
    @ParameterizedTest(name = "Test #" + ParameterizedTest.INDEX_PLACEHOLDER)
    @CsvSource({"4.0,2.3",
            "12.3,2.0"})
    void testSubtract(float operandA, float operandB) {

        Calculator calculator = new Calculator();
        float actual = calculator.subtract(operandA, operandB);
        float expected = operandA - operandB;
        assertThat(actual).isCloseTo(expected, withinPercentage(1));
    }

    @DisplayName("Calculator division test")
    @ParameterizedTest(name = "Test #" + ParameterizedTest.INDEX_PLACEHOLDER)
    @CsvSource({"4.0,2.3",
            "12.3,2.0"})
    void testDivide(float operandA, float operandB) {

        Calculator calculator = new Calculator();
        float actual = calculator.divide(operandA, operandB);
        float expected = operandA / operandB;
        assertThat(actual).isCloseTo(expected, withinPercentage(1));
    }

    @DisplayName("Calculator multiplication test")
    @ParameterizedTest(name = "Test #" + ParameterizedTest.INDEX_PLACEHOLDER)
    @CsvSource({"4.0,2.3",
            "12.3,2.0"})
    void testMultiply(float operandA, float operandB) {

        Calculator calculator = new Calculator();
        float actual = calculator.multiply(operandA, operandB);
        float expected = operandA * operandB;
        assertThat(actual).isCloseTo(expected, withinPercentage(1));
    }

}
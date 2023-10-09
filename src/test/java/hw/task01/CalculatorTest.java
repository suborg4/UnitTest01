package hw.task01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Позитивные тесты для метода calculator

    @Test
    public void additionShouldReturnCorrectResult() {
        int result = calculator.calculation(3, 3, '+');
        assertEquals(6, result, "Addition should return correct result");
    }

    @Test
    public void differenceShouldReturnCorrectResult() {
        int result = calculator.calculation(6, 3, '-');
        assertEquals(3, result, "Subtraction should return correct result");
    }

    @Test
    public void multiplicationShouldReturnCorrectResult() {
        int result = calculator.calculation(4, 2, '*');
        assertEquals(8, result, "Multiplication should return correct result");
    }

    @Test
    public void divisionShouldReturnCorrectResult() {
        int result = calculator.calculation(18, 3, '/');
        assertEquals(6, result, "Division should return correct result");
    }

    // Негативные тесты для метода calculation

    @Test
    public void divisionByZeroShouldThrowException() {
        assertThrows(ArithmeticException.class, () ->
                calculator.calculation(5, 0, '/'), "Division by zero should throw an exception");
    }

    @Test
    public void invalidOperatorShouldThrowException() {
        assertThrows(IllegalStateException.class, () ->
                calculator.calculation(9, 3, '_'), "Invalid operator should throw an exception");
    }
}
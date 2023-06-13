package org.example;

import HW4.Triangle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @ParameterizedTest
    @CsvSource({"3, 4, 5, 6.0", "11, 12, 13, 61", "6, 8, 10, 24.0"})
    void testCorrectTriangSquare(int a, int b, int c, double expectedSquare) {
        logger.info("Стороны треугольника: " + a + "," + b + "," + c + ", ожидаемая площадь = " + expectedSquare);
        assertEquals(Triangle.square(a, b, c), expectedSquare);
    }

    @ParameterizedTest
    @CsvSource({"3, 4, 5, 3.0", "11, 12, 13, 61.0", "6, 8, 10, 24.123456789"})
    void testIncorrectTriangleSquare(int a, int b, int c, double expectedSquare) {
        logger.warn("Стороны треугольника: " + a + "," + b + "," + c + ", ожидаемая площадь = " + expectedSquare);
        assertNotEquals(Triangle.square(a, b, c), expectedSquare);
    }


    // Проверки исключений на некорректность длин сторон - ArithmeticException
    @ParameterizedTest
    @CsvSource({"0, 0, 0", "-2, -2, -2", "1, 2, 3"})
    void testExceptionIncorrectSides(int a, int b, int c) {
        logger.error("Стороны треугольника: " + a + "," + b + "," + c + ", ожидается ArithmeticException");
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> Triangle.square(a, b, c));
    }

    // Проверка исключения на пустые длины сторон - NullPointerException
    @ParameterizedTest
    @CsvSource({", , ", "1, , ", ", 2, ", ", , 3"})
    void testExceptionNullSides(Integer a, Integer b, Integer c) {
        logger.error("Стороны треугольника: " + a + "," + b + "," + c + ", ожидается NullPointerException");
        assertThatNullPointerException().isThrownBy(() -> Triangle.square(a, b, c));
    }
}

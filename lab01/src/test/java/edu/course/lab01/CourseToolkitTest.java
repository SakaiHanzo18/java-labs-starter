
package edu.course.lab01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        assertTrue(CourseToolkit.isEven(8));
    }

    @Test
    void returnsFalseForOddNumber() {
        assertFalse(CourseToolkit.isEven(7));
    }

    @Test
    void returnsTrueForZero() {
        assertTrue(CourseToolkit.isEven(0));
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        assertTrue(CourseToolkit.isEven(-8));
    }

    @Test
    void returnsFalseForNegativeOddNumber() {
        assertFalse(CourseToolkit.isEven(-5));
    }

    @Test
    void returnsFalseForNumbersLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void returnsTrueForTwo() {
        assertTrue(CourseToolkit.isPrime(2));
    }

    @Test
    void returnsTrueForPrimeNumber() {
        assertTrue(CourseToolkit.isPrime(13));
    }

    @Test
    void returnsFalseForCompositeNumber() {
        assertFalse(CourseToolkit.isPrime(9));
    }

    @Test
    void returnsFalseForSquareOfPrimeNumber() {
        assertFalse(CourseToolkit.isPrime(49));
    }

    @Test
    void returnsTrueForPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("level"));
    }

    @Test
    void returnsFalseForNonPalindrome() {
        assertFalse(CourseToolkit.isPalindrome("hello"));
    }

    @Test
    void considersCaseAndSpaces() {
        assertFalse(CourseToolkit.isPalindrome("Level"));
        assertFalse(CourseToolkit.isPalindrome("a b"));
    }

    @Test
    void throwsExceptionForNullText() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.isPalindrome(null)
        );
    }

    @Test
    void calculatesAverage() {
        assertEquals(2.5, CourseToolkit.average(new int[]{2, 3}));
    }

    @Test
    void calculatesAverageForNegativeNumbers() {
        assertEquals(-3.0, CourseToolkit.average(new int[]{-2, -4}));
    }

    @Test
    void calculatesFractionalAverage() {
        assertEquals(2.0 / 3.0, CourseToolkit.average(new int[]{1, 0, 1}) / 1.0);
    }

    @Test
    void throwsExceptionForNullArray() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.average(null)
        );
    }

    @Test
    void throwsExceptionForEmptyArray() {
        assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.average(new int[]{})
        );
    }

    @Test
    void doesNotModifyInputArray() {
        int[] values = {1, 2, 3};
        int[] original = {1, 2, 3};

        CourseToolkit.average(values);

        assertEquals(original[0], values[0]);
        assertEquals(original[1], values[1]);
        assertEquals(original[2], values[2]);
    }
}

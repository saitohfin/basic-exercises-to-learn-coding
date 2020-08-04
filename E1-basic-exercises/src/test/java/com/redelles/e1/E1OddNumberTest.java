package com.redelles.e1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class E1OddNumberTest {

    @Test
    public void zeroIsNotOdd() {
        final Boolean expected = Boolean.FALSE;
        final Boolean result = Odd.isOdd(0);
        assertEquals("0 is odd", expected, result);
    }

    @Test
    public void oneIsNotOdd() {
        final Boolean expected = Boolean.TRUE;
        final Boolean result = Odd.isOdd(1);
        assertEquals("0 is odd", expected, result);
    }

    @Test
    public void notOdd() {
        final List<Integer> notOddNumbers = Arrays.asList(
            0, 2, 4, 6, 8, 10
        );
        for (Integer number : notOddNumbers) {
            final Boolean result = Odd.isOdd(number);
            assertFalse(number + "is odd", result);
        }
    }

    @Test
    public void oddNumbers() {
        final List<Integer> notOddNumbers = Arrays.asList(
            1, 3, 5, 7, 9, 11
        );
        for (Integer number : notOddNumbers) {
            final Boolean result = Odd.isOdd(number);
            assertTrue(number + "is not odd", result);
        }
    }
}

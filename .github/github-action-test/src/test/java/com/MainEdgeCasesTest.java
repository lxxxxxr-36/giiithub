package com;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MainEdgeCasesTest {

    @Test
    void add_withNegative_throwsIllegalArgumentException() {
        Main main = new Main();
        assertThrows(IllegalArgumentException.class, () -> main.add(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> main.add(5, -1));
    }

    @Test
    void add_withOverflow_throwsArithmeticException() {
        Main main = new Main();
        assertThrows(ArithmeticException.class, () -> main.add(Integer.MAX_VALUE, 1));
    }
}
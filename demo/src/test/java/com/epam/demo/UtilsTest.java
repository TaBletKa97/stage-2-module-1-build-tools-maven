package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        assertTrue(Utils.isAllPositiveNumbers(new ArrayList<>(Arrays.asList("1", "3", "10"))));
        assertFalse(Utils.isAllPositiveNumbers(new ArrayList<>(Arrays.asList("0", "-3", "10"))));
        assertFalse(Utils.isAllPositiveNumbers(new ArrayList<>(Arrays.asList("2", "1", "0"))));
        assertFalse(Utils.isAllPositiveNumbers(new ArrayList<>(Arrays.asList("0", "2", "-1"))));
        assertFalse(Utils.isAllPositiveNumbers(new ArrayList<>(Arrays.asList("-5", "-20", "-1"))));
    }
}
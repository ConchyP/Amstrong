package com.conchy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberAmstrongTest {

    @Test
    public void testNumberIsAmstrong() {
        assertTrue(NumberAmstrong.isAmstrong(1));
        assertTrue(NumberAmstrong.isAmstrong(153));
        assertTrue(NumberAmstrong.isAmstrong(371));
        assertTrue(NumberAmstrong.isAmstrong(1634));
    }

    @Test
    public void testNumberIsNotAmstrong() {
        assertFalse(NumberAmstrong.isAmstrong(12));
        assertFalse(NumberAmstrong.isAmstrong(96));
        assertFalse(NumberAmstrong.isAmstrong(123));
        assertFalse(NumberAmstrong.isAmstrong(7563));
    }
}

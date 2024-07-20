package com.conchy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AmstrongTest {

    @Test
    public void testNumberIsAmstrong() {
        assertTrue(Amstrong.isAmstrong(371));
    }

    @Test
    public void testNumberIsNotAmstrong() {
        assertFalse(Amstrong.isAmstrong(123));
    }
}

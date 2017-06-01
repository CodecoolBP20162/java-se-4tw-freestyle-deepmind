package com.codecool.mindreader;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {
    @RepeatedTest(100)
    public void testNewFirstDigit() {
        MindReader mindReader = new MindReader(3);
        assertTrue(mindReader.newDigit(0) >= 0 && mindReader.newDigit(0) <= 9);
    }

    @RepeatedTest(100)
    public void testNewNotFirstDigit() {
        MindReader mindReader = new MindReader(3);
        assertTrue(mindReader.newDigit(2) >= 1 && mindReader.newDigit(2) <= 9);
    }
}
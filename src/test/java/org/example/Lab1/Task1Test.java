package org.example.Lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void findSequenceOfRepetitionsTest() {
        int testValue1 = 441136;
        int testValue2 = 111184;
        int testValue3 = 415555;
        int testValue4 = 178239;

        assertEquals(Task1.findSequenceOfRepetitions(testValue1), 2);
        assertEquals(Task1.findSequenceOfRepetitions(testValue2), 4);
        assertEquals(Task1.findSequenceOfRepetitions(testValue3), 4);
        assertEquals(Task1.findSequenceOfRepetitions(testValue4), 0);
    }
}
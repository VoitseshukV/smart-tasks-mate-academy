package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortLettersTest {

    @Test
    void testStrings() {
        SortLetters sortLetters = new SortLetters();
        assertEquals("aefqr", sortLetters.getUniqueCharacters("fe!!R32r1swrq34qr tferwaf re"));
    }
}
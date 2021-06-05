package com.example.poker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class PokerApplicationTests {

    @Test
    void justTrue() {
        assertTrue(true);
    }

    @Test
    void justThrow() {
        assertThrows(IllegalArgumentException.class, () -> { throw new IllegalArgumentException(); });
    }

}

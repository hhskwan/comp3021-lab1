package hk.ust.cse.comp3021.lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void add() {
        assertEquals(3, Main.add(1, 2));
    }
}

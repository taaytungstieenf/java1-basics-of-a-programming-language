package com.example.part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testGreet() {
        App app = new App();
        assertEquals("Hello from Part1!", app.greet());
    }
}

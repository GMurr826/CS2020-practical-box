package org.test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    /**
     * Test printing
     */
    @Test
    public void calcTest() {
        System.setOut(new PrintStream(outContent));
        Calculator obj = new Calculator(4,5);
        assertEquals(9, obj.add());
        assertEquals(-1, obj.sub());
        assertEquals(20, obj.mul());
    }
}

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
    public void testPrinting()
    {
        System.setOut(new PrintStream(outContent));
        App obj = new App ();
        obj.printSum(3);
        
        assertEquals("The sum is: 3", outContent.toString().trim());
        System.setOut(originalOut);
    } 
    
    /**
     * Test addition
     */
    @Test
    public void addNumbers()
    {
        App obj = new App ();
        assertEquals( 2, obj.calculateSum(1,1));
        assertEquals( -2, obj.calculateSum(-1,-1));
        assertEquals( 0, obj.calculateSum(0,0));
    }
    
    
}

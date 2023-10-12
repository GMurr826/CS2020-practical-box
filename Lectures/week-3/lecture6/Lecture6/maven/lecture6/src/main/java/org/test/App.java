package org.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public int calculateSum (int a, int b) {
        return a+b;
    }
    
    public void printSum (int a) {
        System.out.println ("The sum is: "+ a);
    }
    
    public static void main( String[] args )
    {
        App app = new App();
        app.printSum(app.calculateSum (1,2));
    }
}

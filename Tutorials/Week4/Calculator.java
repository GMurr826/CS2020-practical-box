public class Calculator {
    //create instance variables
    private int x;
    private int y;
    public static String version = "v1.3";

    //constructor initialises class variables
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void checkInt(int x, int y) {
        if (x < 0 || x > 60 || y < 0 || y > 60) {
            throw new IllegalArgumentException("This calculator can only work with numbers in the range 0-60");
        }
    }

    //add method adds two integers and returns the result
    public int add() {
        checkInt(x,y);
        return x + y;
    }

    //sub method subtracts two integers and returns the result
    public int sub() {
        checkInt(x,y);
        return x - y;
    }

    //mul method multiplies two methods and returns the result
    public int mul() {
        checkInt(x,y);
        return x * y;
    }
}
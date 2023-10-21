package calculator;

public abstract class Calculator {
    abstract double addNumbers();
    abstract double subtractNumbers();
    abstract double multiplyNumbers();
    public static String about = "This is a magic calculator";

    public void about() {
        System.out.println(about);
    }
}
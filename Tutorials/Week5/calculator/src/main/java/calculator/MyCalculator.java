package calculator;

public class MyCalculator extends Calculator implements VersionInfo {
    private double x;
    private double y;

    MyCalculator(double x, double y) {
        about();
        this.x = x;
        this.y = y;
    }

    @Override
    public double addNumbers() {
        return x + y;
    }

    @Override
    public double subtractNumbers() {
        return x - y;
    }

    @Override
    public double multiplyNumbers() {
        return x * y;
    }

    @Override
    public void printVersion() {
        System.out.println("Magic Calculator 2.0");
    }

    @Override
    public String getAuthorInfo() {
        return "No author data available";
    }
}
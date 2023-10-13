import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the calculator\nType 'exit' at any point to stop the program");

        while (true) {
            System.out.println("Enter the first number: ");
            String x = input.next();

            if (x.equals("exit")) {
                return;
            }

            System.out.println("Enter the operator (+, -, *): ");
            String op = input.next();

            if (op.equals("exit")) {
                return;
            }

            System.out.println("Enter the second number: ");
            String y = input.next();

            if (y.equals("exit")) {
                return;
            }
        
            Calculator calculation = new Calculator(Integer.parseInt(x),Integer.parseInt(y));

            if (op.equals("+")) {
                System.out.println(calculation.add());
            }

            else if (op.equals("-")) {
                System.out.println(calculation.sub());
            }

            else {
                System.out.println(calculation.mul());
            }

            System.out.println("Calculated using Magic Calculator version " + calculation.version);
        }
        
    }
}
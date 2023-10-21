import java.util.Scanner;

public class DailyCost{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total miles driven per day: ");
        int milesPerDay = input.nextInt();

        System.out.print("Enter the cost per gallon of petrol: ");
        int costPerGallon = input.nextInt();

        System.out.print("Enter the average miles per gallon: ");
        int milesPerGallon = input.nextInt();

        System.out.print("Enter the parking fees per day: ");
        int feesPerDay = input.nextInt();

        System.out.print("Enter the tolls per day: ");
        int tollsPerDay = input.nextInt();

        int fuelCosts = ((milesPerDay/milesPerGallon)/costPerGallon);
        int total = (fuelCosts + feesPerDay + tollsPerDay);

        System.out.print("Your daily driving cost is £");
        System.out.printf("%d%n",total);

        input.close();
    }
}
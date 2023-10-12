import java.util.Scanner;

public class numRange{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the desired range (x<y)");
        System.out.print("x: ");
        int rangeX = input.nextInt();

        System.out.print("y: ");
        int rangeY = input.nextInt();

        for (int counter = rangeX; counter < (rangeY+1); counter++) {
            if (counter%2==0) {
                System.out.printf("%d ", counter);
            }
        }

        System.out.println("");
    }
}
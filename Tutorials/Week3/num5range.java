import java.util.Scanner;

public class num5range{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the desired range (x<y)");
        System.out.print("x: ");
        int rangeX = input.nextInt();

        System.out.print("y: ");
        int rangeY = input.nextInt();

        int counter2 = 1;

        for (int counter = rangeX; counter < (rangeY+1); counter++) {
            if (counter2%5==0) {
                if (counter%2==1) {
                    if ((counter*3)<100) {
                        System.out.printf("%d ", (counter*3));
                    }
                }
            }
            counter2++;
        }

        System.out.println("");
    }
}
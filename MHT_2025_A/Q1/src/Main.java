
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int cntTotal = 0, sum = 0, cntPos = 0;
        double avg;

        while (cntTotal <= 15 && sum <= 100) {
            System.out.print("Enter a number --> ");
            num = input.nextInt();

            if (num > 0) {
                cntPos++;
            }

            cntTotal++;
            sum += num;
        }

        avg = (double) sum / cntTotal;
        System.out.format("\nThe average is: %.2f and there are %d positive numbers.", avg, cntPos);
    }
}

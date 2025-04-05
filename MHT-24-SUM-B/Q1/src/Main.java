
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int posCnt = 0;
        int negCnt = 0;
        int posSum = 0;
        float posAvg = 0;
        String message = "No positive numbers entered.\n";

        do {
            System.out.print("Enter a number: ");
            num = in.nextInt();

            if (num > 0) {
                posSum += num;
                posCnt++;
            } else if (num < 0) {
                negCnt++;
            }
        } while (num != 0);

        if (posCnt > 0) {
            posAvg = posSum / posCnt;
            message = "Positive numbers average: %.2f\n";
        }

        System.out.format("Negative numbers count: %d\n", negCnt);
        System.out.format(message, posAvg);
    }
}

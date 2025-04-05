
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String str;
        int aCnt = 0;

        for (int i = 0; i < 20; i++) {
            System.out.format("%d : Enter a string: ", i + 1);
            str = in.nextLine();

            if (str.length() % 2 == 0) {
                System.out.format("First: %c | Last: %c\n", str.charAt(0), str.charAt(str.length() - 1));
            }

            if (str.charAt(0) == 'A' || str.charAt(str.length() - 1) == 'A') {
                aCnt++;
            }
        }

        System.out.println(aCnt);

    }
}

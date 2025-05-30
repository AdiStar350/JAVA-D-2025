
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String maxStr = null;
        String minStr = null;
        int capCnt = 0;

        for (int i = 0; i < 30; i++) {
            System.out.format("%d. Enter a string --> ", i + 1);
            String str = input.nextLine();

            if (maxStr == null || str.length() >= maxStr.length()) {
                maxStr = str;
            }

            if (minStr == null || str.length() <= minStr.length()) {
                minStr = str;
            }

            if (Character.isUpperCase(str.charAt(0))) {
                capCnt++;
            }
        }

        System.out.format("\nThe longest string --> %s\nThe shortest string --> %s\nThe amount of capitalized first character --> %d\n", maxStr, minStr, capCnt);
    }
}

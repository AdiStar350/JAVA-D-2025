
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random rnd = new Random();
    static Scanner input = new Scanner(System.in);

    /**
     * Prompts the user to enter 20 numbers, calculates the sum of even numbers,
     * and counts the number of double-digit numbers.
     */
    public static void q1() {
        int doubleCnt = 0;
        int evenSum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.format("%d Please enter a number: ", i + 1);
            int num = input.nextInt();

            if (num >= 10 && num <= 99) {
                doubleCnt++;
            }
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        System.out.format("The even sum is: %d\nThe double digit count is: %d\n", evenSum, doubleCnt);
    }

    /**
     * Prompts the user to enter strings until a string with an odd length is
     * entered. Counts the number of strings where the first and last characters
     * are the same. Also checks if the string contains the character 'Z'.
     */
    public static void q2() {
        String str = "";
        int sameCnt = 0;

        while (str.length() % 2 == 0) {
            System.out.print("Please enter a string: ");
            str = input.nextLine();

            if (str.contains("Z")) {
                System.out.format("%s: Z is here!\n", str);
            }
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                sameCnt++;
            }
        }
        System.out.format("There are %d strings with the same last and first characters.\n", sameCnt);
    }

    /**
     * Generates 40 random double-digit numbers, determines the number that
     * appears the most, and lists numbers that were not chosen.
     */
    public static void q3() {
        int[] cntArr = new int[90];
        int maxApp = 0;
        int maxNum = 0;

        for (int i = 0; i < 40; i++) {
            int num = (int) (rnd.nextInt(90) + 10);

            cntArr[num - 10]++;
        }

        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] >= maxApp) {
                maxApp = cntArr[i];
                maxNum = i + 10;
            }
        }

        System.out.format("The number which appeared the most is: %d\n", maxNum);
        System.out.println("The numbers that were not chosen:");

        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] == 0) {
                System.out.println(i + 10);
            }
        }
    }

    /**
     * Prints the names of foods in the array that can be changed to the new
     * food.
     *
     * @param arr Array of Food objects.
     * @param newFood The new Food object to compare.
     * @complexity O(n), where n is the size of the array.
     */
    public static void changes(Food[] arr, Food newFood) {
        System.out.println("Foods that can be changed:");

        for (Food f : arr) {
            if (f.canChange(newFood)) {
                System.out.println(f.getName());
            }
        }
    }

    /**
     * Prints pairs of foods whose combined price is less than 100.
     *
     * @param arr Array of Food objects.
     * @complexity O(n^2), where n is the size of the array.
     */
    public static void offers(Food[] arr) {
        System.out.println("Possible pairs:");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getPrice() + arr[j].getPrice() < 100f) {
                    System.out.format("%s and %s\n", arr[i].getName(), arr[j].getName());
                }
            }
        }
    }

    /**
     * Checks if the sum of the first k elements in the array is divisible by k.
     *
     * @param arr The array of integers.
     * @param k The number of elements to consider.
     * @return True if the sum of the first k elements is divisible by k, false
     * otherwise.
     * @complexity O(k), where k is the number of elements to consider.
     */
    public static boolean isPerfectK(int[] arr, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        return sum % k == 0;
    }

    /**
     * Checks if all prefixes of the array are perfect according to the
     * isPerfectK method.
     *
     * @param arr The array of integers.
     * @return True if all prefixes of the array are perfect, false otherwise.
     * @complexity O(n^2), where n is the size of the array.
     */
    public static boolean isSuperPerfect(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (!isPerfectK(arr, i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * The main method to execute the program.
     */
    public static void main(String[] args) {
        // System.out.println("Testing q1:");
        // q1();
        // 
        // System.out.println("Testing q2:");
        // q2();
        // 
        // System.out.println("Testing q3:");
        // q3();
        // System.out.println("Testing changes:");
        // Food[] foods = {
        //     new Food(true, "Milk", 50.0, 5),
        //     new Food(false, "Bread", 30.0, 4),
        //     new Food(true, "Cheese", 60.0, 5)
        // };
        // Food newFood = new Food(true, "Butter", 40.0, 5);
        // changes(foods, newFood);
        // 
        // System.out.println("Testing offers:");
        // offers(foods);
        //
        // int[] arr = {7, 1, 4, 1, 2, 3, 1, 2, 3};
        // System.out.println(isPerfectK(arr, 5));
        // 
        // System.out.println(isSuperPerfect(arr));
    }
}

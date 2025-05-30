
import java.util.Random;

/**
 * Main class to demonstrate generating a random substring from a given string.
 */
public class Main {

    /**
     * Generates a random substring from the given string.
     *
     * @param mainStr The input string from which the substring is generated.
     * @return A random substring of the input string.
     */
    public static String getSubStr(String mainStr) {
        // Validate the input string
        if (mainStr == null || mainStr.isEmpty()) {
            return "";
        }

        // Create a Random instance for generating random indices
        Random random = new Random();

        // Generate two random indices within the bounds of the string
        int idx1 = random.nextInt(mainStr.length());
        int idx2 = random.nextInt(mainStr.length());

        // Ensure the two indices are not the same
        while (idx1 == idx2) {
            idx2 = random.nextInt(mainStr.length());
        }

        // Determine the start and end indices for the substring
        int start = Math.min(idx1, idx2); // The smaller index
        int end = Math.max(idx1, idx2) + 1; // The larger index + 1 to include the character at the end index

        // Return the substring from the start index to the end index
        return mainStr.substring(start, end);
    }

    public static void main(String[] args) {
        // Define a sample string
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Generate and print a random substring from the sample string
        System.out.println(getSubStr(str));
    }
}

public class Main {
    /**
     * Checks if the character at the specified index in the array is greater than the character to its left
     * and less than the character to its right.
     *
     * @param arr the array of characters
     * @param index the index of the character to check
     * @return true if the character at the specified index is greater than the character to its left
     *         and less than the character to its right, false otherwise
     */
    public static boolean isUpgraded(char[] arr, int index) {
        char check = arr[index];
        boolean checkLeft = index == 0 || arr[index - 1] < check;
        boolean checkRight = index == arr.length - 1 || arr[index + 1] > check;

        return checkLeft && checkRight;
    }

    public static void main(String[] args) {
        char[] arr = {'X', 'C', 'E', 'T', 'Z'};
        int index = 0;

        System.out.println(isUpgraded(arr, index));
    }
}

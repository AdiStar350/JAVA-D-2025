public class Main {
    /**
     * Checks if all digits between the minimum and maximum digits of the given number are present.
     *
     * @param num the number to check
     * @return true if all digits between the minimum and maximum digits are present, false otherwise
     */
    public static boolean isMissing(int num) {
        int cnt = 0;
        int dig;
        int maxDig = num % 10;
        int minDig = num % 10;
        int[] counter = new int[10];

        while (num > 0) {
            dig = num % 10;
            counter[dig]++;
            cnt++;
            num /= 10;

            if (dig < minDig) { minDig = dig; }
            else if (dig > maxDig) { maxDig = dig; }
        }

        if (cnt != maxDig - minDig + 1) { return false; }

        for (int i = minDig + 1; i < maxDig; i++) {
            if (counter[i] == 0) { return false; }
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 123567890;

        System.out.println(isMissing(num));
    }
}

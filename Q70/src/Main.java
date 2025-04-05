public class Main {
    /**
     * Finds the most frequent number in the array and displays the missing numbers.
     *
     * @param arr the input array of integers
     * @return the most frequent number if it appears more than once, otherwise null
     */
    public static Integer getMaxAppAndDisplayMissing(int[] arr) {
        int[] counter = new int[90];
        int maxCnt = 0;
        int maxNum = arr[0];

        for (int num : arr) {
            counter[num - 10]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0) { System.out.print(i + 10 + "  "); }
            else if (counter[i] >= maxCnt) {
                maxCnt = counter[i];
                maxNum = i + 10;
            }
        }

        System.out.println();

        return maxCnt > 1 ? maxNum : null;
    }

    public static void main(String[] args) {
        int[] arr = new int[40];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 90 + 10);
        }

        System.out.println(getMaxAppAndDisplayMissing(arr));
    }
}

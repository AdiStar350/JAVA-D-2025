
public class Main {

    public static boolean specialNumber(int num) {
        if (num < 10) {
            return false;
        }

        int cnt = 0;
        int evenSum = 0;
        int oddSum = 0;

        while (num != 0) {
            int dig = num % 10;

            if (cnt % 2 == 0) {
                evenSum += dig;
            } else {
                oddSum += dig;
            }

            cnt++;
            num /= 10;
        }

        return evenSum == oddSum;
    }

    public static boolean isSpecialArray(int[] arr) {
        boolean nonSpecialFound = false;

        for (int num : arr) {
            if (specialNumber(num)) {
                if (nonSpecialFound) {
                    return false;
                }
            } else {
                nonSpecialFound = true;
            }
        }

        return true;
    }

    public static int[] buildSpecialArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < newArr.length - 1; i++) {
            boolean sorted = true;

            for (int j = 0; j < newArr.length - 1 - i; j++) {
                if (!specialNumber(newArr[j]) && specialNumber(newArr[j + 1])) {
                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                    sorted = false;
                }
            }

            if (sorted) {
                return newArr; // Exit early if no swaps were made
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        // int[] arr = {12551, 6215, 77, 4254, 4, -561}; // true
        // int[] brr = {12551, 4, 6215, 77, 4254, -561}; // false
        int[] brr1 = {12551, 4, 6215};
        int[] brr2 = {77, 4254, -561};

        // System.out.println(isSpecialArray(arr));
        // System.out.println(isSpecialArray(brr));
        int[] newArr = buildSpecialArray(brr1, brr2);

        for (int n : newArr) {
            System.out.print(n + " ");
        }

        System.out.println(isSpecialArray(newArr));
    }
}

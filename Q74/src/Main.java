
public class Main {

    public static boolean exists(int num, int dig) {
        while (num > 0) {
            if (num % 10 == dig) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static boolean isStrangers(int num1, int num2) {
        while (num1 > 0) {
            if (exists(num2, num1 % 10)) {
                return false;
            }
            num1 /= 10;
        }

        return true;
    }

    public static boolean isItStrangers(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (!isStrangers(arr[i], arr[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}


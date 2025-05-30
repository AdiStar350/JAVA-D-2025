
public class Main {

    public static int[] doItNice(int size) {
        if (size % 2 == 0) {
            size++;
        }

        int[] arr = new int[size];

        do {
            for (int i = 0; i < size; i++) {
                arr[i] = (int) (Math.random() * 900 + 100);
            }
        } while (!isNice(arr));

        return arr;
    }

    public static boolean isNice(int[] arr) {
        if (arr.length % 2 == 0) {
            return false;
        }

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            sumLeft += arr[i];
            sumRight += arr[arr.length - i - 1];
        }

        return sumLeft == sumRight && sumLeft == arr[arr.length / 2];
    }

    public static void main(String[] args) {
        int[] arr = doItNice(7);

        isNice(arr);
    }
}

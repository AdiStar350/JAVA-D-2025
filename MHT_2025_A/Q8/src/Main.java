
public class Main {

    public static int[] sortArr(int[] arr) {
        boolean sorted;

        for (int i = 0; i < arr.length - 1; i++) {
            sorted = true;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;
                }
            }

            if (sorted) {
                return arr;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        
        int[] arr = {2, 7, 18, 10, 13, 4, 21};

        sortArr(arr);
    }
}

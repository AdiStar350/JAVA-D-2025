public class Main {
    public static boolean isCrossAvg(int[][] arr, int row, int col) {
        double avg = 0;
        int cnt = arr.length + arr[0].length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i != row) {
                avg += arr[i][col];
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            if (i != col) {
                avg += arr[row][i];
            }
        }

        return arr[row][col] == avg / cnt;
    }

    public static int cntCrossAvg(int[][] arr) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length; j++) {
                if (isCrossAvg(arr, i, j)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
    
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    }
}

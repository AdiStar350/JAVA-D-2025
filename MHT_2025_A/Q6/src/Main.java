
public class Main {

    public static int excellent(int[] gradesCountingArray) {
        int cnt = 0;

        for (int i = 0; i < 9; i++) {
            cnt += gradesCountingArray[gradesCountingArray.length - 1 - i];
        }

        return cnt;
    }

    public static int higherGrade(int[] gradesCountingArray) {
        for (int i = gradesCountingArray.length - 1; i >= 0; i--) {
            if (gradesCountingArray[i] > 0) {
                return i;
            }
        }

        return 0;
    }

    public static int mostCommonScore(int[] countArr) {
        int maxGrade = countArr.length - 1;
        int maxCount = 0;

        for (int i = countArr.length - 1; i >= 0; i--) {
            if (maxCount < countArr[i]) {
                maxGrade = i;
                maxCount = countArr[i];
            }
        }

        return maxGrade;
    }

    public static void main(String[] args) {

    }
}

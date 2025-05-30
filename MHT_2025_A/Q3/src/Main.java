
public class Main {

    public static void main(String[] args) {
        int eveCnt = 0;
        int eveDigCnt = 0;

        for (int i = 0; i < 60; i++) {
            int num = (int) (Math.random() * 900 + 100);

            System.out.format("%d. --> %d\n", i + 1, num);

            if (num % 2 == 0) {
                eveCnt++;
                eveDigCnt++;
            } else {
                num /= 10;

                for (int j = 0; j < 2; j++) {
                    int dig = num % 10;
                    num /= 10;

                    if (dig % 2 == 0) {
                        eveDigCnt++;
                        break;
                    }
                }
            }
        }

        System.out.format("\nEven numbers --> %d\nNumbers with even digits --> %d\n", eveCnt, eveDigCnt);
    }
}

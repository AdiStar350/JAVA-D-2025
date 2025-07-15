
import java.util.Scanner;
import java.util.Random;
import javax.naming.ldap.Rdn;

public class Main {

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void q1() {
        int cnt = 0;
        int cntPos = 0;
        int sum = 0;

        do {
            System.out.print("> ");
            int num = input.nextInt();
            cnt++;
            sum += num;

            if (num > 0) {
                cntPos++;
            }
        } while (sum <= 100 && cnt <= 15);

        System.out.format("avg: %.2f, positive count: %d\n", sum / (double) cnt, cntPos);
    }

    public static void q2() {
        int shortLen = Integer.MAX_VALUE;
        int longLen = Integer.MIN_VALUE;

        String shortStr = "";
        String longStr = "";

        for (int i = 0; i < 30; i++) {
            System.out.print("> ");
            String str = input.next();
            int len = str.length();

            if (len >= longLen) {
                longLen = len;
                longStr = str;
            }

            if (len <= shortLen) {
                shortLen = len;
                shortStr = str;
            }
        }

        System.out.format("shortest: %s, longest: %s", shortStr, longStr);
    }

    public static void q3() {
        int evenCnt = 0;
        int hasEvenDig = 0;

        for (int i = 0; i < 60; i++) {
            int num = 100 + random.nextInt(900);
            System.out.format("%d ", num);

            if (num % 2 == 0) {
                evenCnt++;
                hasEvenDig++;
            } else {
                num /= 10;

                for (int j = 0; j < 2; j++) {
                    int dig = num % 10;

                    if (dig % 2 == 0) {
                        hasEvenDig++;
                        break;
                    }

                    num /= 10;
                }
            }
        }

        System.out.format("even number count: %d, numbers with even digits count: %d", evenCnt, hasEvenDig);
    }

    public static void print(Dog[] arr) {
        for (Dog dog : arr) {
            if (dog.getIsImmune() && dog.isItSuitable('M', 2)) {
                System.out.format("%s - %s\n", dog.getName(), dog.getType());
            }
        }
    }

    public static int countNoAge(Dog[] arr) {
        int cnt = 0;

        for (Dog dog : arr) {
            if (!dog.getIsImmune() && dog.getAge() == 0) {
                cnt++;
            }
        }

        return cnt;
    }

    public static boolean isNice(int[] arr) {
        if (arr.length % 2 == 0) {
            return false;
        }

        int midIdx = arr.length / 2;
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < midIdx) {
                sumLeft += arr[i];
            } else if (i > midIdx) {
                sumRight += arr[i];
            }
        }

        return sumRight == sumLeft && sumLeft == arr[midIdx];
    }

    public static int[] doItNice(int size) {
        if (size % 2 == 0) {
            size++;
        }

        int[] arr = new int[size];

        while (true) {
            for (int i = 0; i < size; i++) {
                arr[i] = 100 + random.nextInt(900);
            }

            if (isNice(arr)) {
                return arr;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // q1();
            // q2();
            // q3();

            //// q4
            // Dog[] dogs = {
            //     new Dog("Buddy", "Labrador", 'M', 3, true),
            //     new Dog("Max", "Beagle", 'M', 0, true),
            //     new Dog("Bella", "Poodle", 'F', 2, true),
            //     new Dog("Charlie", "Bulldog", 'M', 0, false),
            //     new Dog("Lucy", "Golden Retriever", 'F', 4, true)
            // };

            // print(dogs);
            // System.out.println("Count of dogs with no age and not immune: " + countNoAge(dogs));

            int[] arr = doItNice(15);

            for (int n : arr) {
                System.out.format("%d, ", n);
            }
        } finally {
            input.close();
        }
    }
}

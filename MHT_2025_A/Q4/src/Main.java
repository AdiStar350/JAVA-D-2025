
public class Main {

    public static int countNoAge(Dog[] arr) {
        int cnt = 0;

        for (Dog d : arr) {
            if (d.getAge() == 0 && !d.isIsImmune()) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void print(Dog[] arr) {
        for (Dog d : arr) {
            if (d.isIsImmune() && d.isItSuitable('M', 2)) {
                System.out.format("%s --> %s\n", d.getName(), d.getType());
            }
        }
    }

    public static void main(String[] args) {

    }
}

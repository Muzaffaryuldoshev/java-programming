package loops;

public class OddNums {
    public static void main(String[] args) {
        for (int i = 0; i <= 19; i++) {
            if (!(i % 2 == 0)) {
                System.out.print(i + "-");
            }
        }

    }
}

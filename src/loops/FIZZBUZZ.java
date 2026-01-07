package loops;

public class FIZZBUZZ {
    public static void main(String[] args) {
        int givenNum = 20;
        for (int i = 1; i <= givenNum; i++) {
            if (i % 3 == 0) {
                System.out.print("FIZZ" + " ");
            } else if (i % 5 == 0) {
                System.out.print("BUZZ" + " ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FIZZBUZZ" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

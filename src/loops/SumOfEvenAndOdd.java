package loops;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {

        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }else {
                oddSum += i;
            }

        }
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);

    }
}

package loops;

public class Pattern {
    public static void main(String[] args) {
        int givenNum = 7;
        for (int i = 0; i <= 7; i++) {
            System.out.print("#");
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int s = 0; s < 1 ; s++) {
                System.out.print("#");
            }


            System.out.println();
        }

    }
}

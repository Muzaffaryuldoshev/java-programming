package loops;

public class FInra {
    public static void main(String[] args) {

        int givenNum = 20;
       int i  = 1;

        do {
            if (i%3 == 0) {
                System.out.print("FIN" + " ");
            }else if (i%5 == 0) {
                System.out.print("RA" + " ");
            }else if (i%3 == 0 && i%5 == 0) {
                System.out.print("FINRA" + " ");
            }else {
                System.out.print(i + " ");
            }
            i++;

        } while(i < givenNum);




    }
}

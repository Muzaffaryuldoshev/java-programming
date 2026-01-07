package loops;

public class MultipilicationTable {
    public static void main(String[] args) {
        int givenNum = 9;
        System.out.println("Multipilication table for " + givenNum);
        System.out.println("--------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(givenNum + "  x  " + i + " = "+  givenNum * i);
        }


    }
}

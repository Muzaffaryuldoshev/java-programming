package loops;

public class MultipilicationTablewithNestedLoop {
    public static void main(String[] args) {


        for (int i = 2; i <= 9; i++) {
            System.out.print("Table for " + i);
            System.out.println();
            for (int j = 2; j <= 9 ; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }

    }
}

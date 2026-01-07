package loops;

public class SquarePatternWhile {
    public static void main(String[] args) {
        int givenNum = 7;
        int givenRow = 1;

        while(givenRow < givenNum  ){
            int j = 1;
            while(j < givenNum){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            givenRow++;
        }

    }
}

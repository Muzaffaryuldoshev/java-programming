package selection_statements;

public class FINRA {
    public static void main(String[] args) {
        int givenNumber = 15;
        double sumForFIN = givenNumber %3;
        double sumForRA = givenNumber %5;
        if (givenNumber%3 == 0 && givenNumber%5 == 0) {
            System.out.println("FINRA");
        } else if (sumForFIN == 0) {
           System.out.println("FIN");
       }else if (sumForRA == 0) {
           System.out.println("RA");
       }

    }
}

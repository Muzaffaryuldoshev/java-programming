package selection_statements;

public class Grade {
    public static void main(String[] args) {
        int math, chemistry, biology;
        math = 90;
        chemistry = 90;
        biology = 98;

        if(math < 0 || math > 100
        || chemistry < 0 || chemistry > 100
        || biology < 0 || biology > 100) {
            System.out.println("Invalid Input");
        }else {
            double average = (math + chemistry + biology) / 3;
            System.out.println("The average is " + average);
            if (average > 0 && average < 59) {
                System.out.println("Grade is F" );
            }else if (average > 60 && average < 69) {
                System.out.println("Grade is D" );
            }else if (average > 70 && average < 79) {
                System.out.println("Grade is C" );
            }else if (average > 80 && average < 89) {
                System.out.println("Grade is B" );
            }else if (average > 90 && average < 99) {
                System.out.println("Grade is A" );
            }
        }




    }

}

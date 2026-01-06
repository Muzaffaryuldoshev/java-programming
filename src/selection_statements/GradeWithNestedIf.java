package selection_statements;

public class GradeWithNestedIf {
    public static void main(String[] args) {
        int grade, score;
        score = 89;
        if (score >= 0 && score <= 100) {

            if (score < 60) {
                System.out.println("Fail");
            } else if (score >= 60 && score < 90) {
                System.out.println("Pass");
            } else if (score >= 90 && score <= 100) {
                System.out.println("Passed with distinction");
            }

        } else {
            System.out.println("Invalid Score");
        }

    }
}
package selection_statements;

public class WeeklyWage {
    public static void main(String[] args) {
        double weeklyWage = 900;
        double workingHours = 41;
        if(workingHours > 40){
            weeklyWage *= 1.5;
            System.out.println("The weekly wage is " + weeklyWage);
        }

        boolean practice = false;
        if(!practice){
            System.out.println("Woow");
        }

    }

}

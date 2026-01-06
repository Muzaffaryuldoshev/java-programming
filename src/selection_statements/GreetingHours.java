package selection_statements;

public class GreetingHours {
    public static void main(String[] args) {
        int hour = 7;
        if (hour >= 6 && hour <= 12){
            System.out.println("Good Morning");
        }else  if (hour >= 12 && hour <= 15){
            System.out.println("Good Afternoon");
        }else  if (hour >= 15 && hour <= 22){
            System.out.println("Good Evening");
        }else if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour");
        }else{
            System.out.println("Good night");
        }
    }
}

package selection_statements;

public class Calculator {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 2;
        num2 = 3;

        char operator = '*';

        switch(operator){
            case '+': System.out.println(num1 + num2);
            break;
            case '-': System.out.println(num1 - num2);
            break;
            case '*': System.out.println(num1 * num2);
            break;
            case '/': System.out.println(num1 / num2);
            break;
            case '%': System.out.println(num1 % num2);
            break;
            default: System.out.println("Invalid: " + operator);
        }
    }
}

package selection_statements;

import java.util.Scanner;

public class ChoosenLang {
    public static void main(String[] args) {
        System.out.println("1. English  2. Spanish  3. Turkish  4. Russian  5. French");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the language you would like to choose from: 1 to 5: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Hello, thank you for your call");
        }else if (choice == 2) {
            System.out.println(" Hola, gracias por llamar");
        }else if (choice == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        }else if (choice == 4) {
            System.out.println(" Привет, спасибо за ваш звонок");
        }else if (choice == 5) {
            System.out.println("Merci, pour votre appel");
        }else {
            System.out.println("Invalid choice");
        }


    }
}

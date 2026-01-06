package selection_statements;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        int requiredAge = 18;
        int realAge = 17;

        if(requiredAge < realAge){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}

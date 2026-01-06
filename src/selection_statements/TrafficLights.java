package selection_statements;

public class TrafficLights {
    public static void main(String[] args) {

        char currentLight = 'r';
        switch(currentLight){
            case 'r', 'R':
                System.out.println("Red Light");
                break;
                case 'Y', 'y':
                    System.out.println("Yellow Light");
                    break;
            case 'g', 'G':
                System.out.println("Green Light");
                break;
                default:
                    System.out.println("Invalid Light");
        }

    }
}

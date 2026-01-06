package selection_statements;

public class LaptopModels {
    public static void main(String[] args) {
        String laptopName = "dell";
        switch(laptopName){
            case "Apple", "apple":
                System.out.println("Apple no-virus");
                break;
            case "dell", "Dell" :
                System.out.println("Tough one");
                break;
            case "acer", "Acer":
                System.out.println("Not-recommended");
                break;
                default:
                    System.out.println("Don't buy that Laptop");

        }

    }

}

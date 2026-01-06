package selection_statements;

public class Revenue {
    public static void main(String[] args) {
        double price, quantity, netRevenue;
        price = 150;
        quantity = 4;
        double revenue = price * quantity;
        double discount, discountRate;
        discountRate = 10;
        if(revenue > 5000) {
            discount = revenue * discountRate/100;
            System.out.println("Discount: " + discount);
            netRevenue = revenue - discount;
            System.out.println("Net Revenue: " + netRevenue);
        }else {
            System.out.println("Revenue: "+ revenue);
        }



    }

}

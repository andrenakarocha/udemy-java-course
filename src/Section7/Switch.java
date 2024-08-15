package Section7;

public class Switch {
    public static void main(String[] args) {
        String customerStatus = "premium_customer";

        // O switch só consegue comparar igualdade, diferentemente do if-else
        switch (customerStatus){
            case "guest":
                System.out.println("Thank you for your order!");
                break;

            case "regular_customer":
                System.out.println("Thank you for your order! Here is a 10% discount for staying with us!");
                break;

            case "premium_customer":
                System.out.println("WOW, you are a Premium customer! Here is 25% discount!!");
                break;

            default:
                System.out.println("Customer doesn't have status set");
        }
    }
}

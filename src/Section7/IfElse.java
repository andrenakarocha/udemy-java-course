package Section7;

public class IfElse {
    public static void main(String[] args) {
        int amountOfMoney = 200;
        int itemPrice = 300;

        // purchase logic here
        if (amountOfMoney < itemPrice) {
            System.out.println("You don't have money for buying this item!");
        } else {
            System.out.println("Item bought");
        }
    }
}

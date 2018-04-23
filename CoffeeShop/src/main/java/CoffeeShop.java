public class CoffeeShop {
    public static void main(String args[]) {

        Customer jack = new Customer("Jack", "Latte");

        CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
        coffeeAttendent.takeOrder(jack);

        coffeeAttendent.prepareDrink("Latte");

        coffeeAttendent.callOutCompletedOrder();
    }
}

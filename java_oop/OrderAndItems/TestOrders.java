import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
    // System.out.println("Test Successful");

        // Menu items

        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 4.50;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 5.25;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 5.75;

        Item item4 = new Item();
        item4.name = "Cappucinno";
        item4.price = 4.75;

        // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        order1.name = "Cindhuri";
        // Predict what will happen if you print order1.total
        System.out.println("Total: " + order1.total + "\n");
        

        Order order2 = new Order();
        order2.name = "Jimmy";
        

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

    
        // Application Simulations

        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri’s order is now ready. Update her status.
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        // Jimmy’s order is now ready. Update his status.
        order2.ready = true;
        
        // Use this example code to test various orders' updates

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println("");

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.println("");

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.println("");

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }
}
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
    // System.out.println("Test Successful");

        // Menu items

        Item item1 = new Item("Mocha", 4.50);
        Item item2 = new Item("Latte", 5.25);
        Item item3 = new Item("Drip Coffee", 5.75);
        Item item4 = new Item("Cappucinno", 4.75);

        // Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();
        
        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Mark");
        Order order4 = new Order("James");
        Order order5 = new Order("Chloe");

        // Implement the addItem method within the Order class

        // Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order1.addItem(item1);
        order1.addItem(item2);

        // Implement the getStatusMessage method within the Order class
        System.out.println(order1.getStatusMessage());

        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        order2.setReady(true);
        order4.setReady(true);
        System.out.println(order2.getStatusMessage());
        System.out.println(order4.getStatusMessage());

        // Implement the getOrderTotal method within the Order class
        order2.addItem(item1);
        System.out.println(order2.getOrderTotal());

        // Test the total by printing the return value like so:
        // System.out.println(order1.getOrderTotal());
        System.out.println(order1.getOrderTotal());
        
        // Implement the display method within the Order Class
        order1.display();

        // Finally, call the display method on all of your orders, like so: order3.display();
        order3.addItem(item2);
        order3.addItem(item4);
        order3.addItem(item1);
        order3.display();

    }
}
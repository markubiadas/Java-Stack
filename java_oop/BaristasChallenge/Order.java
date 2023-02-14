import java.util.ArrayList;

public class Order {

    // Member Variables:
    // public double total;
    private String name;
    private boolean ready;
    private ArrayList<Item>items = new ArrayList<Item>();

    // Constructor:

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
        this.ready = false;
    }

    // Overloaded Constructor:

    public Order (String name){
        this.name = name;
        this.ready = false;
    }


    // Order Methods:

    // addItem
    public void addItem(Item item){
        this.items.add(item);
    }

    
    // getStatusMessage
    public String getStatusMessage(){
        if(this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return  "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // getOrderTotal
    public double getOrderTotal(){
        double total = 0;
        for(Item oneItem: this.items){
            total += oneItem.getPrice();
        }
        return total;
    }


    // display
    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(Item oneItem: this.items){
            System.out.println(oneItem.getName() + " - $" + oneItem.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }


    // Getters and Setters:
    // Get
    public String getName(){
        return this.name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    // Set
    public void setName(String name){
        this.name = name;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

}
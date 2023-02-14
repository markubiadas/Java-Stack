public class Item {

    // Member Variables:
    private String name;
    private double price;

    public Item(){}

    // Constructor:
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Getters & Setters:
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
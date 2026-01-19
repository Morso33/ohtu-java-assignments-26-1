import java.util.ArrayList;
import java.util.HashMap;

class GroceryItem {
    private String name;
    private double cost;
    private String category;
    private int quantity;

    public GroceryItem(String name, double cost, String category, int quantity) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " | $" + cost + " | Category: " + category + " | Quantity: " + quantity;
    }
}
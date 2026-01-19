
import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();

    // Task 1: Basic Operations
    public void addItem(String name) {
        groceryList.add(new GroceryItem(name, 0.0, "Uncategorized", 1));
    }

    public void removeItem(String name) {
        boolean removed = groceryList.removeIf(item -> item.getName().equalsIgnoreCase(name));
        if (!removed) {
            System.out.println("Item \"" + name + "\" not found in the grocery list.");
        }
    }

    public void displayList() {
        if (groceryList.isEmpty()) {
            System.out.println("Grocery list is empty.");
            return;
        }
        System.out.println("Grocery List:");
        int i = 1;
        for (GroceryItem item : groceryList) {
            System.out.println(i + ". " + item.getName());
            i++;
        }
    }

    public boolean checkItem(String name) {
        for (GroceryItem item : groceryList) {
            if (item.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Task 2: Total Cost Calculation
    public void addItem(String name, double cost) {
        groceryList.add(new GroceryItem(name, cost, "Uncategorized", 1));
    }

    public double calculateTotalCost() {
        double total = 0;
        for (GroceryItem item : groceryList) {
            total += item.getCost() * item.getQuantity();
        }
        return total;
    }

    // Task 3: Categorizing Items
    public void addItem(String name, double cost, String category) {
        groceryList.add(new GroceryItem(name, cost, category, 1));
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category \"" + category + "\":");
        boolean found = false;
        for (GroceryItem item : groceryList) {
            if (item.getCategory().equalsIgnoreCase(category)) {
                System.out.println("- " + item.getName() + " | $" + item.getCost() + " | Quantity: " + item.getQuantity());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found in this category.");
        }
    }

    // Task 4: Quantity Tracking
    public void addItem(String name, double cost, String category, int quantity) {
        groceryList.add(new GroceryItem(name, cost, category, quantity));
    }

    public void updateQuantity(String name, int newQuantity) {
        boolean found = false;
        for (GroceryItem item : groceryList) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(newQuantity);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item \"" + name + "\" not found to update quantity.");
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        boolean anyAvailable = false;
        for (GroceryItem item : groceryList) {
            if (item.getQuantity() > 0) {
                System.out.println("- " + item);
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No items with positive quantity available.");
        }
    }
}

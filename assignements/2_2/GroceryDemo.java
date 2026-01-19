public class GroceryDemo {
        public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items with different details
        manager.addItem("Apples", 1.5, "Fruits", 5);
        manager.addItem("Milk", 2.0, "Dairy", 2);
        manager.addItem("Bread", 1.2, "Bakery", 3);
        manager.addItem("Eggs", 0.3, "Dairy", 12);

        // Display full list
        manager.displayList();
        System.out.println();

        // Check item
        System.out.println("Is \"Milk\" in the grocery list? " + manager.checkItem("Milk"));
        System.out.println();

        // Remove item
        System.out.println("Removing \"Milk\" from the list...");
        manager.removeItem("Milk");
        System.out.println();

        // Display updated list
        manager.displayList();
        System.out.println();

        // Display by category
        manager.displayByCategory("Dairy");
        System.out.println();

        // Update quantity
        manager.updateQuantity("Eggs", 6);
        manager.displayAvailableItems();
        System.out.println();

        // Calculate total cost
        System.out.println("Total cost of groceries: $" + manager.calculateTotalCost());
    }
}
